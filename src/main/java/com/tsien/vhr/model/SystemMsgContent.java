package com.tsien.vhr.model;

import java.time.LocalDateTime;
import lombok.Data;

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