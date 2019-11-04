package com.lindroid.mybatisplustest.constant

/**
 * @author Lin
 * @date 2019/10/18
 * @function 返回结果文字
 * @Description
 */
object ResultMsg {
    const val FIND_SUCCESS = "查询成功"

    const val DELETE_SUCCESS = "删除成功"

    const val UPDATE_SUCCESS = "更新成功"

    const val INSERT_SUCCESS = "新增成功"

    const val NOT_FOUND = "资源不存在"

    /**
     * 资源存在并且对其操作会引起冲突
     */
    const val CONFLICT = "资源已存在"
}