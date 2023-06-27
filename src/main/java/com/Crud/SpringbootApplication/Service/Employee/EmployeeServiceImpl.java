package com.Crud.SpringbootApplication.Service.Employee;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Respository.EmployeeRespository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRespository employeeRespository;
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRespository.findAll();
	}

	@Override
	public void save(Employee employee) {
		employeeRespository.save(employee);
	}

	@Override
	public Employee getById(Long id) {
		Employee employee = null;
		if (Objects.nonNull(id)) {
			Optional<Employee> optionalEmployee = employeeRespository.findById(id);
			if(optionalEmployee.isPresent()) {
				employee = optionalEmployee.get();
			}else {
				throw new RuntimeException("Employee not found with the id:"+id);
			}
		}
		
		return employee;
	}

	@Override
	public void deleteById(Long id) {
		if(Objects.nonNull(id));
			employeeRespository.deleteById(id);
		
	}

	@Override
	public List<Employee> getEmployeeByID(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		long id = employee.getId();
		Employee emp = employeeRespository.findById(id).get();
		emp.setName(employee.getName());
		emp.setSurname(employee.getSurname());
		emp.setAge(employee.getAge());
		emp.setPhone(employee.getPhone());
		emp.setAddress(employee.getAddress());
		emp.setStatus(employee.getStatus());
		emp.setStartDate(employee.getStartDate());
		emp.setTeam(employee.getTeam());
		emp.setBillingRate(employee.getBillingRate());
		emp.setPreviousIncrease(employee.getPreviousIncrease());
		emp.setTimesheet(employee.getTimesheet());
		emp.setPayment_type(employee.getPayment_type());
		emp.setSupplier(employee.getSupplier());
		emp.setPassword(employee.getPassword());
		emp.setRoles(employee.getRoles());
		
		
		return employeeRespository.save(emp);
	}

	@Override
	public Employee getById(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
