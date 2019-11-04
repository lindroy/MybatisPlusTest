package com.lindroid.mybatisplustest.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact


/**
 * @author Lin
 * @date 2019/11/3
 * @function
 * @Description
 */

@Configuration
@EnableSwagger2
class SwaggerConfig :WebMvcConfigurer{

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("swagger-ui.html")
            .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
            .addResourceLocations("classpath:/META-INF/resources/webjars/")
    }

    @Bean
    fun createRestApi() = Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        //需要生成api包路径
        .apis(RequestHandlerSelectors.basePackage("com.lindroid.mybatisplustest.controller"))
        .paths(PathSelectors.any())
        .build()

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            //页面标题
            .title("android http 请求测试")
            //版本号
            .version("1.0")
            //创建人
            .contact(Contact("Lin", "http://www.baidu.com", ""))
            //描述
            .description("Api 描述")
            .build()
    }
}