package com.lindroid.mybatisplustest.mapper

import com.lindroid.mybatisplustest.model.entity.User
import com.baomidou.mybatisplus.core.mapper.BaseMapper


/**
 * @author Lin
 * @since 2019-11-03
 * @function  user映射器
 * @description
 */
interface UserMapper : BaseMapper<User> {

    fun findById(id: Int):User
}

