package com.lindroid.mybatisplustest

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper
import com.lindroid.mybatisplustest.mapper.EmployeeMapper
import com.lindroid.mybatisplustest.mapper.UserMapper
import com.lindroid.mybatisplustest.model.entity.User
import com.lindroid.mybatisplustest.utils.println
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

    /**
     * 更新-条件更新
     */
    @Test
    fun testUpdate(){
        val updateWrapper=UpdateWrapper<User>().apply {
            set("age",22)
            eq("name","张三")
        }
        userMapper.update(null,updateWrapper)
    }

    /**
     * 删除-根据条件删除
     */
    @Test
    fun testDeleteByMap(){
        val columnMap = HashMap<String,Any>().apply{
            put("age",26)
            put("name","吴九")
        }
        //符合以上所有条件才能删除成功
        println("result=${userMapper.deleteByMap(columnMap)}")
    }

    @Test
    fun testestSelectBatchIds(){
        val users = userMapper.selectBatchIds(listOf(1,2,3))
        users.println()
    }

    @Test
    fun testCusSelect(){
        println("=========user:${userMapper.findById(1)}===========")

    }

}