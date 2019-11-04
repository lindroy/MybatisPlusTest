package com.lindroid

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @author Lin
 * @date 2019/10/18
 * @function
 * @Description
 */

@SpringBootApplication
@MapperScan("com.lindroid.mybatisplustest.mapper")
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}