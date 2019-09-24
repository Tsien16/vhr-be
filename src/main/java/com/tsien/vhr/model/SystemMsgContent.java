package com.tsien.vhr.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:41
 */

@Data
public class SystemMsgContent {
    /**
    * 系统消息文本ID
    */
    private Long msgContentId;

    /**
    * 消息标题
    */
    private String msgTitle;

    /**
    * 消息文本
    */
    private String msgContent;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;
}