package com.lindroid.mybatisplustest.model.entity

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import java.io.Serializable
import com.lindroid.mybatisplustest.config.NoArg

/**
 * @author Lin
 * @since 2019-11-03
 * @function  user实体类
 * @description
 */
@NoArg
@TableName("user")
data class User(
    @TableId(value = "id", type = IdType.AUTO)
    var id: Int?, var userName: String?,  //用户名
    var age: Int?,  //年龄
    var password: String?,  //密码
    var name: String?,  //姓名
    var email: String?   //邮箱
) : Serializable

