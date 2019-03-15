package com.sensor.service;

import com.sensor.entity.Sensor;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sensor
 * @since 2019-03-14
 */
public interface ISensorService extends IService<Sensor> {
    /**
     * 查询最近的一条记录
     *
     * @return Sensor
     */
    Sensor lately();



    boolean save(String heartRate, String temperature, String levelLndicators);
}
