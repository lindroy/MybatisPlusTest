package com.lindroid.mybatisplustest.utils

import com.baomidou.mybatisplus.core.toolkit.StringPool
import com.baomidou.mybatisplus.generator.AutoGenerator
import com.baomidou.mybatisplus.generator.InjectionConfig
import com.baomidou.mybatisplus.generator.config.*
import com.baomidou.mybatisplus.generator.config.po.TableInfo
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy
import java.util.*
import kotlin.collections.ArrayList

/**
 * @author Lin
 * @date 2019/10/17
 * @function 代码生成器
 * @Description
 */
/**
 * 在控制台输入表名
 */

private val projectPath = System.getProperty("user.dir")

private fun scannerTables(): Array<String> {
    val scanner = Scanner(System.`in`)
    println("请输入表名（多个表格时中间用英文逗号隔开）：")
    if (scanner.hasNext()) {
        val input = scanner.next()
        if (input.isNotEmpty()) {
            return input.split(",").toTypedArray()
        }
    }
    throw Exception("请输入正确的表名！")
}

fun main() {
    //代码生成器
    val generator = AutoGenerator()

    //全局配置
    generator.globalConfig = with(GlobalConfig()) {
        outputDir = "$projectPath/src/main/kotlin"
        author = "Lin"
        isKotlin = true
        isOpen = false

        serviceName = "%sService" //Service类类名
        this
    }
    //数据源配置
    generator.dataSource = with(DataSourceConfig()) {
        url = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&useSSL=false&allowMultiQueries=true"
        driverName = "com.mysql.cj.jdbc.Driver"
        username = "root"
        password = "123456"
        this
    }
    //包配置
    generator.packageInfo = with(PackageConfig()) {
        parent = "com.lindroid.mybatisplustest"
        mapper = "mapper"
        entity = "entity"
        controller = "controller"
        service = "service"
        serviceImpl = "service.impl"
        xml = "mapper.xml"
        this
    }
    //策略配置
    generator.strategy = with(StrategyConfig()) {
        naming = NamingStrategy.underline_to_camel
        superServiceClass = null
        superServiceImplClass = null
        superMapperClass = null
        isRestControllerStyle = true
        setInclude(*scannerTables())
        this
    }
    //自定义模板
    generator.template = with(TemplateConfig()) {
        entityKt = "templates/entitykt.kt"
        controller = "templates/controller.java"
        service = "templates/service.java"
        serviceImpl = "templates/serviceImpl.java"
        this
    }
    //自定义配置
    val focList = ArrayList<FileOutConfig>()
    focList.add(object : FileOutConfig("") {
        /**
         * 输出文件
         */
        override fun outputFile(tableInfo: TableInfo?) =
            "$projectPath/src/main/resources/mapper/${tableInfo!!.entityName}Mapper${StringPool.DOT_XML}"
    })
    val cfg = object : InjectionConfig() {
        /**
         * 注入自定义 Map 对象
         */
        override fun initMap() {
        }
    }
    cfg.fileOutConfigList = focList
    generator.cfg = cfg
    //执行生成
    generator.execute()

}