package com.training.springcloud.service;

import org.springframework.stereotype.Repository;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.training.springcloud.model.Employee;

@Repository
public class EmployeeService {
	
	@HystrixCommand(fallbackMethod = "getEmployeeFallBack")
	public Employee newEmployee(){
		//Commented - to generate Hystrix fallback method.
		//return new Employee("1001","Employee1", "Manager",11500);
		boolean isError=true;
		
		if(isError){
			throw new RuntimeException();
		}
		
		return null;
		
	}
	
	
	public Employee getEmployeeFallBack(){
		return new Employee("FallBack Method Called","Employee Default", "Designation Default",11500);
	}
	

}
