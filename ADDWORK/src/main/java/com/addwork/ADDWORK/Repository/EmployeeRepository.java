package com.addwork.ADDWORK.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addwork.ADDWORK.entities.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
