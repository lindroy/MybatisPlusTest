package com.lindroid.mybatisplustest.service.impl;

import com.lindroid.mybatisplustest.model.entity.User;
import com.lindroid.mybatisplustest.mapper.UserMapper;
import com.lindroid.mybatisplustest.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Lin
 * @since 2019-11-03
 * @function  user服务实现类
 * @description 
 */
@Service
class UserServiceImpl : ServiceImpl<UserMapper, User>(), UserService {

}
