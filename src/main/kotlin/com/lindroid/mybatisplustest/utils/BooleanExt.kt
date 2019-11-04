package com.lindroid.mybatisplustest.utils

/**
 * @author Lin
 * @date 2019/10/19
 * @function Boolean扩展
 * @Description
 */
sealed class BooleanExt<out T>//起桥梁作用的中间类，定义成协变

object Otherwise : BooleanExt<Nothing>()//Nothing是所有类型的子类型，协变的类继承关系和泛型参数类型继承关系一致

class TransferData<T>(val data: T) : BooleanExt<T>()//data只涉及到了只读的操作

//声明成inline函数
inline fun <T> Boolean.yes(block: () -> T): BooleanExt<T> = when {
    this -> {
        TransferData(block.invoke())
    }
    else -> Otherwise
}

inline fun <T> BooleanExt<T>.no(block: () -> T): T = when (this) {
    is Otherwise ->
        block()
    is TransferData ->
        this.data
}