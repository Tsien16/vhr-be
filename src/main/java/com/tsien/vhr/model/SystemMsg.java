package com.tsien.vhr.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class SystemMsg {
    /**
    * 系统消息ID
    */
    private Long msgId;

    /**
    * 消息文本ID
    */
    private Long msgContentId;

    /**
    * 0表示群发消息
    */
    private Boolean msgType;

    /**
    * 这条消息是给谁的
    */
    private Long userId;

    /**
    * 消息是否已读，0-未读，1-已读
    */
    private Boolean isRead;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;
}