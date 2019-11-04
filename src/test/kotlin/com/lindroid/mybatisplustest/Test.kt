package com.lindroid.mybatisplustest

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper
import com.lindroid.mybatisplustest.mapper.EmployeeMapper
import com.lindroid.mybatisplustest.mapper.UserMapper
import com.lindroid.mybatisplustest.model.entity.User
import org.junit.runner.RunWith
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource


@RunWith(SpringRunner::class)
@SpringBootTest
class Test {

    @Resource
    lateinit var mapper:EmployeeMapper
    @Resource
    lateinit var userMapper: UserMapper

    @Test
    fun test1(){
        val list = mapper.selectList(null)
//        list.forEach(::println)
        list.forEach {
            println(it)
        }
    }

    @Test
    fun testUpdate(){
        val updateWrapper=UpdateWrapper<User>().apply {
            set("age",22)
            eq("name","张三")
        }
        userMapper.update(null,updateWrapper)
    }
}