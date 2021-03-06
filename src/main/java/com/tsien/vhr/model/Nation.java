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
public class Nation {
    /**
    * 民族ID
    */
    private Long nationId;

    /**
    * 民族名称
    */
    private String nationName;

    /**
    * 是否逻辑删除，1-表示删除，0-表示未删除
    */
    private Boolean deleted;

    /**
    * 创建时间
    */
    private LocalDateTime createTime;

    /**
    * 更新时间
    */
    private LocalDateTime updateTime;
}