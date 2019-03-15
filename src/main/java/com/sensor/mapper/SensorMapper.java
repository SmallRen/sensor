package com.sensor.mapper;

import com.sensor.entity.Sensor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sensor
 * @since 2019-03-14
 */

public interface SensorMapper extends BaseMapper<Sensor> {

}
