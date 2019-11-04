package com.lindroid.mybatisplustest.model.entity

import com.baomidou.mybatisplus.core.metadata.IPage
import com.lindroid.mybatisplustest.constant.HTTP_BAD_REQUEST
import com.lindroid.mybatisplustest.constant.HTTP_OK

/**
 * @author Lin
 * @date 2019/10/11
 * @function 请求结果格式
 * @Description
 */
class RespResult(
    val code: Int,
    val message: String,
    val data: Any?
) {
    companion object {
        fun ok(data: Any? = null, message: String = "请求成功") = RespResult(HTTP_OK, message, data)

        fun fail(data: Any? = null, message: String = "请求失败", code: Int = HTTP_BAD_REQUEST) =
            RespResult(HTTP_BAD_REQUEST, message, data)

        fun insert(data: Any? = null, message: String = "新增成功") = RespResult(HTTP_OK, message, data)

        fun delete(data: Any? = null, message: String = "删除成功") = RespResult(HTTP_OK, message, data)

        fun update(data: Any? = null, message: String = "修改成功") = RespResult(HTTP_OK, message, data)

        fun find(data: Any? = null, message: String = "查询成功") = RespResult(HTTP_OK, message, data)

        fun <T : Any> page(data: IPage<T>, message: String = "查询成功") = RespResult(
            HTTP_OK, message,
            PageEntity(
                data.records,
                data.size,
                data.current,
                data.total,
                data.pages
            )
        )

    }
}

