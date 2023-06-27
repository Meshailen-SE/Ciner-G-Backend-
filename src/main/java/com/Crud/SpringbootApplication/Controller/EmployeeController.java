package com.Crud.SpringbootApplication.Controller;

import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Respository.EmployeeRespository;
import com.Crud.SpringbootApplication.Service.Employee.EmployeeService;


@RestController
@CrossOrigin(origins = "http://localhost:8084",allowCredentials="true")
@RequestMapping(value= "/api",method= {RequestMethod.POST,RequestMethod.GET})
//@CrossOrigin(origins = "http://beta2cinerg-env.eba-imvt7tff.us-east-2.elasticbeanstalk.com",allowCredentials="true")
//@RequestMapping(value= "/api",method= {RequestMethod.POST,RequestMethod.GET})
@Controller

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	//Create new employee
	@PostMapping("/createEmployee")
    public void createAndSaveEmployee(@Validated @RequestBody Employee employee) {
		 employeeService.save(employee);
	}
	//Read all
	@GetMapping("/Employee")
	public List<Employee> viewHomePage(Model model) {
		model.addAttribute("allemplist", employeeService.getAllEmployee());
		return employeeService.getAllEmployee();
	}
	//Read by Id
//	@GetMapping("/Employee/{id}")
//	public Employee getEmployeeById(@PathVariable(value="id")long id, Model model) {
//		Employee employee = employeeService.getById(id);
//		
//		return employee;	
//	}
	
	
	@GetMapping("/Employee/{id}")
	public List<Employee> getEmployeeById(@PathVariable("id") long id, Employee employee){
		employee.setId(id);
		return employeeService.getEmployeeByID(employee);
	}
	
	//Update
	
	
	@PutMapping("/testupdateEmployeeform/")
	public Employee updateEmployee( @RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
//	@PutMapping("/updateEmployeeform/{id}")
//	public Employee updateEmployee(@PathVariable(value = "id") long id, Employee employee) {
//		return employeeService.updateEmployee(employee);
//	}
	
	
	//Delete Id
	@DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable(value = "id") long id){
        employeeService.deleteById(id);
        
    }

    
}
