package com.tsien.vhr.config;

import com.tsien.vhr.constant.Const;
import com.tsien.vhr.model.Role;
import com.tsien.vhr.service.ResourceService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/23 0023 16:49
 */

@Configuration
public class UrlFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    @Resource
    private ResourceService resourceService;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();


    /**
     * 根据请求的url，从数据库读取分析访问这个url需要哪些权限
     *
     * @param object object
     * @return 权限集合
     * @throws IllegalArgumentException IllegalArgumentException
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {

        // 获取请求的Url地址
        String requestUrl = ((FilterInvocation) object).getRequestUrl();

        List<com.tsien.vhr.model.Resource> resources = resourceService.listResources();
        for (com.tsien.vhr.model.Resource resource : resources) {
            if (antPathMatcher.match(resource.getResourceUrl(), requestUrl) && resource.getRoles().size() > 0) {
                List<Role> roles = resource.getRoles();
                int size = roles.size();
                String[] values = new String[size];
                for (int i = 0; i < size; i++) {
                    values[i] = roles.get(i).getRoleName();
                }
                return SecurityConfig.createList(values);
            }
        }

        /*
        没有匹配上的资源，都是登录访问
        这边这是做个ROLE_LOGIN的权限标记
        需要在下一步（UrlAccessDecisionManager）里做判断的
         */
        return SecurityConfig.createList(Const.ROLE_LOGIN);
    }

    /**
     * If available, returns all of the {@code ConfigAttribute}s defined by the
     * implementing class.
     * <p>
     * This is used by the {@link AbstractSecurityInterceptor} to perform startup time
     * validation of each {@code ConfigAttribute} configured against it.
     *
     * @return the {@code ConfigAttribute}s or {@code null} if unsupported
     */
    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    /**
     * Indicates whether the {@code SecurityMetadataSource} implementation is able to
     * provide {@code ConfigAttribute}s for the indicated secure object type.
     *
     * @param clazz the class that is being queried
     * @return true if the implementation can process the indicated class
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }
}
