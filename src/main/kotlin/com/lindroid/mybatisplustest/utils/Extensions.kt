package com.lindroid.mybatisplustest.utils


/**
 * @author Lin
 * @date 2019/10/18
 * @function
 * @Description
 */




/**
 * 判断某个对象是否为null
 */
fun Any?.isNull() = this == null


/**
 * 判断某个对象是否为null
 */
fun Any?.isNotNull() = this != null


fun Boolean.getDeleteResult() = this.yes {
    "所有数据均已删除"
}.no {
    "部分数据删除失败"
}

fun <T:Any> List<T>.println(){
    this.forEach {
        println(it)
    }
}

/*fun Any?.checkNotNull(errorMsg: String? = null) = isNotNull().yes { true }.no {
    throw BaseException(message = errorMsg ?: "空指针异常")
}*/





