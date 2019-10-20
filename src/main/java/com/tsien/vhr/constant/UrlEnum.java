package com.tsien.vhr.constant;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/23 0023 17:05
 */

public enum UrlEnum {
    /**
     * 登录地址
     */
    Login_Processing_Url("/login");

    private String url;

    UrlEnum(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
