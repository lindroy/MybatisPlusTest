package com.lindroid.mybatisplustest.model.entity

/**
 * @author Lin
 * @date 2019/10/21
 * @function 封装分页结果
 * @Description
 */
data class PageEntity<T : Any>(
    val records: List<T> = listOf(),
    val size: Long = 0,  //每页大小
    val current: Long = 0,    //当前页面数目
    val total: Long = 0, //元素总数目
    val totalPages: Long = 0 //页面总数目
)