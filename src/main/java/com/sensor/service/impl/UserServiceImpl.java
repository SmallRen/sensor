package com.sensor.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sensor.entity.User;
import com.sensor.mapper.UserMapper;
import com.sensor.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author sensor
 * @since 2019-03-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public User login(String username, String password) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username", username);
        wrapper.eq("password", password);
        return this.getOne(wrapper);
    }

    @Override
    public boolean checkUserName(String username) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username", username);
        User user = this.getOne(wrapper);
        return user == null ? false : true;
    }

    @Override
    public boolean save(String username, String password, String card) {
        User user = new User();
        user.setUsername(username);
        user.setCard(card);
        user.setPassword(password);
        return this.save(user);
    }
}
