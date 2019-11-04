package com.lindroid.mybatisplustest.constant

/**
 * @author Lin
 * @date 2019/10/11
 * @function
 * @Description
 */

/**
 *  200：服务器响应正常。
304：该资源在上次请求之后没有任何修改（这通常用于浏览器的缓存机制，使用GET请求时尤其需要注意）。
400：无法找到请求的资源。
401：访问资源的权限不够。
403：没有权限访问资源。Forbidden
404：需要访问的资源不存在。
405：需要访问的资源被禁止。
407：访问的资源需要代理身份验证。
414：请求的URL太长。
500：服务器内部错误。
501：服务器不支持当前请求所需要的某个功能
503：Service Unavailable服务器超负载或停机维护
————————————————
版权声明：本文为CSDN博主「嘿嘿嘿1212」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/at10090/article/details/94206873
 */

const val HTTP_OK = 200
const val HTTP_BAD_REQUEST = 400
const val HTTP_NOT_FOUND = 404
const val HTTP_CONFLICT = 409
const val HTTP_SERVER_ERROR = 500
const val HTTP_NOT_IMPLEMENTED=501
const val HTTP_METHOD_NOT_ALLOW = 405


@IntDef(HTTP_OK, HTTP_BAD_REQUEST, HTTP_METHOD_NOT_ALLOW, HTTP_SERVER_ERROR, HTTP_NOT_FOUND, HTTP_CONFLICT)
@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.TYPE)
@Retention(AnnotationRetention.SOURCE)
annotation class HttpStatus

@Target(AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.TYPE, AnnotationTarget.ANNOTATION_CLASS)
annotation class IntDef(vararg val status: Int)
