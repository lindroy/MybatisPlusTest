package com.lindroid.mybatisplustest.model.entity

import java.io.Serializable
import com.lindroid.mybatisplustest.config.NoArg

/**
 * @author Lin
 * @since 2019-10-31
 * @function  employee实体类
 * @description
 */
@NoArg
data class Employee(
    val id: Int?=-1,
    val name: String?=null,  //名字
    val age: Int?=null,  //年龄
    val remark: String?=""   //描述
) : Serializable

