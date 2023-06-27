package com.Crud.SpringbootApplication.Service.Worker;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Model.Worker;
import com.Crud.SpringbootApplication.Respository.EmployeeRespository;

public interface WorkerService {
	
	
	
	
	public List<Worker> getAllWorker();
	public List<Worker> getWorkerByID(Worker worker);
	void save(Worker worker);
	public Worker updateWorker(Worker worker);
	Worker getById(Worker worker);
	
	void deleteById(Long employ_id);
	Worker getById(Long employ_id);
//	List<Worker> getWorkerByID(Worker worker);
	
	
	
}