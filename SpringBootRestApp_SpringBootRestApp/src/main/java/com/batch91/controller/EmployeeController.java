package com.batch91.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.batch91.model.Employee;
import com.batch91.repository.EmployeeRepository;


@RestController
public class EmployeeController {
	
	
	private EmployeeRepository employeeRepository;
	
	
	/**
	 * @param employeeRepository
	 */
	@Autowired
	public EmployeeController(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "We love spring boot";
	}
	
	@RequestMapping("/welcome/{name}")
	public String welcomeMe(@PathVariable String name) {
		return "Namaskaram "+ name;
	}
	
	@RequestMapping("/welcome1")
	//@RequestMapping("/welcome?name={name}")
	public String welcomeRequest(@RequestParam String name) {
		return "Venekkam "+ name;
	}
	
	@GetMapping("/employee")
	//@RequestMapping("/employee")
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
		
	
	}
	
	//@RequestMapping(path="/employee",method="POST")
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {
		employeeRepository.saveAndFlush(emp);
		
	    return new ResponseEntity<>(emp, HttpStatus.CREATED);
	    
		
		
			
	}
	
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<?> getEmployeeById(@PathVariable int empId) {
		try {
			Employee emp = employeeRepository.findById(empId).get();
			return new ResponseEntity<>(emp,HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<>("No such employee exist",HttpStatus.NOT_FOUND);
		}
		
			
   
}
	 @PutMapping("/employee/{empId}")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee emp,@PathVariable int empId) {
		 try{
			 
		 if(employeeRepository.findById(empId).get().getEmpId() == empId) {
			 Employee emp1 = employeeRepository.saveAndFlush(emp);
			 return new ResponseEntity<>(emp1,HttpStatus.OK);
		 }
		 }
		 catch(NoSuchElementException e){
			 return new ResponseEntity<>("Not employee record updated",HttpStatus.NOT_FOUND);
		 }
		 	
		return null;
	}
	 
	 @DeleteMapping("/employee/{empId}")
	 public ResponseEntity<String> deleteEmployee(@PathVariable int empId) {
		 try {
			 if(employeeRepository.findById(empId).get().getEmpId() == empId) {
				employeeRepository.deleteById(empId);
				 
				 return new ResponseEntity<>("Deleted successfully",HttpStatus.OK);
			 }
		 }
		 catch(NoSuchElementException e) {
			 return new ResponseEntity<>("Not employee record exist",HttpStatus.NOT_FOUND);
		 }
		return null;
		 
		 
	 }
	
	
	
	
}
