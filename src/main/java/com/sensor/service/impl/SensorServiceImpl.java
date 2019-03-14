package com.sensor.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sensor.entity.Sensor;
import com.sensor.mapper.SensorMapper;
import com.sensor.service.ISensorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author sensor
 * @since 2019-03-14
 */
@Service
public class SensorServiceImpl extends ServiceImpl<SensorMapper, Sensor> implements ISensorService {
    @Mapper
    SensorMapper mapper;


    @Override
    public Sensor lately() {
        QueryWrapper<Sensor> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("collectDate");
        return mapper.selectOne(wrapper);

    }

    @Override
    public List<Sensor> all() {

         mapper.selectList(null);

         return null;
    }

    @Override
    public boolean save(String heartRate, String temperature, String levelLndicators) {
        Sensor sensor = new Sensor();
        sensor.setHeartRate(heartRate);
        sensor.setTemperature(temperature);
        sensor.setLevelLndicators(levelLndicators);
        sensor.setCollectDate(LocalDateTime.now());
        return mapper.insert(sensor) == 1 ? true : false;
    }
}
