package com.lindroid.mybatisplustest.config

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Lin
 * @date 2019/10/18
 * @function MybatisPlus配置
 * @Description
 */
@Configuration
//@MapperScan("com.mit.mapper")
class MybatisPlusConfig {
    @Bean
    fun performanceInterceptor(): PaginationInterceptor {
        // 开启 count 的 join 优化,只针对 left join !!!
        return PaginationInterceptor().setCountSqlParser(JsqlParserCountOptimize(true))
    }
}
