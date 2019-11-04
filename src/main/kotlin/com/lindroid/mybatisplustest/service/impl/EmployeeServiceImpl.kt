package com.lindroid.mybatisplustest.service.impl

import com.lindroid.mybatisplustest.model.entity.Employee;
import com.lindroid.mybatisplustest.mapper.EmployeeMapper;
import com.lindroid.mybatisplustest.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Lin
 * @since 2019-10-31
 * @function  employee服务实现类
 * @description 
 */
@Service
class EmployeeServiceImpl : ServiceImpl<EmployeeMapper, Employee>(), EmployeeService {

}
