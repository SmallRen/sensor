package com.sensor.service;

import com.sensor.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户服务类
 * </p>
 *
 * @author sensor
 * @since 2019-03-14
 */
public interface IUserService extends IService<User> {
    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return
     */
    User login(String username, String password);

    /**
     * 检查用户名是否存在
     *
     * @param username
     * @return
     */
    boolean checkUserName(String username);

    /**
     * 添加用户
     *
     * @param username
     * @param password
     * @param card
     * @return
     */
    boolean save(String username, String password, String card);
}
