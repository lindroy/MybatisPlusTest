package com.lindroid.mybatisplustest


import com.baomidou.mybatisplus.core.injector.AbstractMethod
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector
import com.baomidou.mybatisplus.extension.injector.methods.additional.InsertBatchSomeColumn
import org.springframework.stereotype.Component

@Component
class MySqlInjector :DefaultSqlInjector(){


    override fun getMethodList(mapperClass: Class<*>?): MutableList<AbstractMethod> {
        val methodList = super.getMethodList(mapperClass)
//        methodList.add(InsertBatchSomeColumn())
        return methodList
    }
}