package com.lindroid.mybatisplustest.model.param

import com.baomidou.mybatisplus.annotation.IdType
import com.baomidou.mybatisplus.annotation.TableId
import com.baomidou.mybatisplus.annotation.TableName
import com.lindroid.mybatisplustest.config.NoArg
import java.io.Serializable

@NoArg
@TableName("user")
data class UserParam(
    var age: Int?,  //年龄
    var password: String?,  //密码
    var name: String?,  //姓名
    var email: String?   //邮箱
) : Serializable