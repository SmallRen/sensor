package com.sensor.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author sensor
 * @since 2019-03-14
 */
public class Sensor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "s_id", type = IdType.AUTO)
    private Integer sId;

    /**
     * 心率
     */
    private String heartRate;

    /**
     * 体温
     */
    private String temperature;

    /**
     * 液位
     */
    private String levelLndicators;

    /**
     * 采集日期
     */
    private LocalDateTime collectDate;

    /**
     * 用户id
     */
    private Integer uId;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }
    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
    public String getLevelLndicators() {
        return levelLndicators;
    }

    public void setLevelLndicators(String levelLndicators) {
        this.levelLndicators = levelLndicators;
    }
    public LocalDateTime getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(LocalDateTime collectDate) {
        this.collectDate = collectDate;
    }
    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "Sensor{" +
        "sId=" + sId +
        ", heartRate=" + heartRate +
        ", temperature=" + temperature +
        ", levelLndicators=" + levelLndicators +
        ", collectDate=" + collectDate +
        ", uId=" + uId +
        "}";
    }
}
