package com.tsien.vhr.model;

import lombok.Data;

import java.util.List;

@Data
public class Area {
    /**
    * 区域ID
    */
    private Long areaId;

    /**
    * 简称
    */
    private String abbreviateName;

    /**
    * 全称
    */
    private String fullName;

    /**
    * 上级区域ID
    */
    private Long parentId;

    /**
    * 经度
    */
    private Double longitude;

    /**
    * 纬度
    */
    private Double latitude;

    /**
    * 等级(1省/直辖市,2地级市,3区县,4镇/街道)
    */
    private Integer areaLevel;

    /**
    * 排序
    */
    private Integer sort;

    /**
    * 是否删除(0未删除/1已删除)
    */
    private Integer deleted;

    /**
     * 下级区域
     */
    List<Area> subordinateAreas;
}