package com.lindroid.mybatisplustest

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.lindroid.mybatisplustest.model.entity.Employee
import com.lindroid.mybatisplustest.mapper.EmployeeMapper
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.annotation.Resource

@RunWith(SpringRunner::class)
@SpringBootTest
class RetrieveTest {
    @Resource
    lateinit var mapper: EmployeeMapper

    @Test
    fun selectByWrapper(){
        val wrapper = QueryWrapper<Employee>().apply{
            like("name","绿")    //名字中包含“绿”
            lt("age",15)    //年龄小于15
        }

        val list = mapper.selectList(wrapper)
        list.forEach(::println)
    }

    @Test
    fun selectByWrapper2(){
        println("——————————————————————selectByWrapper2——————————————————————————————")
        val wrapper = QueryWrapper<Employee>().apply{
            likeLeft("name","绿")    //名字中包含“绿”
            lt("age",15)    //年龄小于15
        }
        val list = mapper.selectList(wrapper)
        list.forEach(::println)
    }


    @Test
    fun insertBatch(){
        val employee1 = Employee(id=8,name = "李一一",age = 11)
        val employee2 = Employee(id=9,name = "李一二",age = 12)
        val employee3 = Employee(id=10,name = "李一三",age = 13)

        val rows = mapper.insertBatchSomeColumn(listOf(employee1,employee2,employee3))
        println("rows=$rows")

    }
}