package com.Crud.SpringbootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Service.Employee.AddendumStorageService;
import com.Crud.SpringbootApplication.Service.Employee.ContractsStorageService;
import com.Crud.SpringbootApplication.Service.Employee.EmployeeService;

import java.util.*;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Crud.SpringbootApplication.Service.Employee.FilesStorageService;
import com.Crud.SpringbootApplication.Service.Employee.FooStorageService;
import com.Crud.SpringbootApplication.Service.Employee.IssuesStorageService;
import com.Crud.SpringbootApplication.Service.Employee.PayslipStorageService;
import com.Crud.SpringbootApplication.Service.Employee.PoStorageService;
import com.Crud.SpringbootApplication.Service.Employee.ReportsStorageService;
@SpringBootApplication
public  class SpringbootApplication implements CommandLineRunner {
	@Resource
	 FilesStorageService storageService;
	@Resource
	AddendumStorageService addendumsStorageService;
	@Resource
	FooStorageService fooStorageService;
	@Resource
	PoStorageService poStorageService;
	@Resource
	PayslipStorageService payslipStorageService;
	
	//HR
	@Resource
	ContractsStorageService contractsStorageService;
	
	@Resource
	IssuesStorageService issuesStorageService;
	
	@Resource
	ReportsStorageService reportsStorageService;
	
	@Autowired
    private Environment env;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	

	@Autowired
	private EmployeeService employeeService;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Employee new_employee = new Employee();
//		this.employeeService.save(new_employee);
		storageService.init();
//		addendumsStorageService.init();
		fooStorageService.init();
		poStorageService.init();
		payslipStorageService.init();
		
		//hr
		contractsStorageService.init();
		issuesStorageService.init();
		reportsStorageService.init();
		
		
	}
	

	
		
}
	
	

