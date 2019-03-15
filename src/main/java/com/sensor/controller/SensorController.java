package com.sensor.controller;


import com.sensor.entity.Sensor;
import com.sensor.service.ISensorService;
import com.sensor.utils.ResponseCode;
import com.sensor.utils.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 传感器控制器
 * </p>
 *
 * @author sensor
 * @since 2019-03-14
 */
@Api(tags = {"传感器模块"})
@RestController
@RequestMapping("/sensor")
public class SensorController {
    @Autowired
    ISensorService sensorService;

    /**
     * 插入传感器数据
     *
     * @param heartRate
     * @param temperature
     * @param levelLndicators
     * @return
     */
    @ApiOperation(value = "插入传感器数据", notes = "插入传感器数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "heartRate", value = "心率", required = true, dataType = "String"),
            @ApiImplicitParam(name = "temperature", value = "体温", required = true, dataType = "String"),
            @ApiImplicitParam(name = "levelLndicators", value = "液位", required = true, dataType = "String")
    })
    @PostMapping("/save")
    public ResponseResult<Boolean> save(@RequestParam("heartRate") String heartRate, @RequestParam("heartRate") String temperature, @RequestParam("heartRate") String levelLndicators) {
        return ResponseResult.e(ResponseCode.OK, sensorService.save(heartRate, temperature, levelLndicators));
    }

    /**
     * 查询所有历史数据
     *
     * @return
     */
    @ApiOperation(value = "查询所有历史数据", notes = "查询所有历史数据")
    @GetMapping("/all")
    public ResponseResult<List<Sensor>> all() {
        return ResponseResult.e(ResponseCode.OK, sensorService.list());
    }

    /**
     * 查询最近的一条数据
     *
     * @return
     */
    @ApiOperation(value = "查询最近的一条数据", notes = "查询最近的一条数据")
    @PostMapping("/lately")
    public ResponseResult<Sensor> lately() {
        return ResponseResult.e(ResponseCode.OK, sensorService.lately());
    }

}
