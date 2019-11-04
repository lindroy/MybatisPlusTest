package com.lindroid.mybatisplustest.controller

import com.lindroid.mybatisplustest.model.entity.RespResult
import com.lindroid.mybatisplustest.model.entity.User
import com.lindroid.mybatisplustest.model.param.UserParam
import com.lindroid.mybatisplustest.service.impl.UserServiceImpl
import com.lindroid.mybatisplustest.utils.convert
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * @author Lin
 * @since 2019-11-03
 * @function  user前端控制器
 * @description
 */
@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    lateinit var service: UserServiceImpl

    @ApiOperation("查询用户信息")
    @ApiParam(value = "id", name = "用户Id", required = true)
    @GetMapping("/{id}")
    fun find(@PathVariable("id") id: Int) = RespResult.find(service.getById(id))


    @ApiOperation("修改用户信息")
    @ApiParam(value = "id", name = "用户Id", required = true)
    @PatchMapping("/{id}")
    fun updateById(@PathVariable("id") id: Int, @RequestBody userParam: UserParam) =
        RespResult.update(service.updateById(userParam.convert<User>().apply { this.id = id }))
}
