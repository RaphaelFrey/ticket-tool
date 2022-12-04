package com.chixsaw.tickettool.repositories;

import com.chixsaw.tickettool.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Raphael Frey on 04.12.2022
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByUsername(String username);
}
