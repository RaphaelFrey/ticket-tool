package com.chixsaw.tickettool.services;

import com.chixsaw.tickettool.model.Employee;

/**
 * Created by Raphael Frey on 04.12.2022
 */
public interface EmployeeService extends CrudService<Employee, Long> {

    Employee findByUsername(String username);
}
