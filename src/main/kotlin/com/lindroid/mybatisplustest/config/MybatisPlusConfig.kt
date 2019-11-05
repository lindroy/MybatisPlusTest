package com.lindroid.mybatisplustest.config

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize
import org.mybatis.spring.annotation.MapperScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.mybatis.spring.mapper.MapperScannerConfigurer



/**
 * @author Lin
 * @date 2019/10/18
 * @function MybatisPlus配置
 * @Description
 */
@Configuration
@MapperScan("com.lindroid.mybatisplustest.mapper")
class MybatisPlusConfig {
   /* @Bean
    fun performanceInterceptor(): PaginationInterceptor {
        // 开启 count 的 join 优化,只针对 left join !!!
        return PaginationInterceptor().setCountSqlParser(JsqlParserCountOptimize(true))
    }


    @Bean
    fun mapperScannerConfigurer(): MapperScannerConfigurer {
        val scannerConfigurer = MapperScannerConfigurer()
        scannerConfigurer.setBasePackage("com.lindroid.mybatisplustest.mapper*")
        return scannerConfigurer
    }*/

}
