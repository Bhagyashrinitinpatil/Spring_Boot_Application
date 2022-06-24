/**
 * 
 */
package com.batch91.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.batch91.model.Employee;

/**
 * @author BHAGYASHRI
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	
	

}
