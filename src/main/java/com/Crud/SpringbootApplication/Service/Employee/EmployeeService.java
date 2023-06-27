package com.Crud.SpringbootApplication.Service.Employee;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Respository.EmployeeRespository;

public interface EmployeeService {
	
	
	
	
	
	public List<Employee> getAllEmployee();
	public List<Employee> getEmployeeByID(Employee employee);
	void save(Employee employee);
	
	
	public Employee updateEmployee(Employee employee);
	
	
	Employee getById(Employee employee);
	
	void deleteById(Long id);
	Employee getById(Long id);
	
	
	
}