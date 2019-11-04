package com.lindroid.mybatisplustest.mapper

import com.lindroid.mybatisplustest.model.entity.Employee
import com.baomidou.mybatisplus.core.mapper.BaseMapper


/**
 * @author Lin
 * @since 2019-10-31
 * @function  employee映射器
 * @description 
 */
interface EmployeeMapper : BaseMapper<Employee>{
    fun insertBatchSomeColumn(list:List<Employee>):Int
}
