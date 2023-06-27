package com.Crud.SpringbootApplication.Service.Worker;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Model.Worker;
import com.Crud.SpringbootApplication.Respository.EmployeeRespository;
import com.Crud.SpringbootApplication.Respository.WorkerRespository;
import com.Crud.SpringbootApplication.Service.Employee.EmployeeService;

@Service
public class WorkerServiceImpl implements WorkerService{
	
	@Autowired
	private WorkerRespository workerRespository;
	@Override
	public List<Worker> getAllWorker() {
		// TODO Auto-generated method stub
		return workerRespository.findAll();
	}

	@Override
	public void save(Worker worker) {
		workerRespository.save(worker);
	}

	@Override
	public Worker getById(Long id) {
		Worker worker = null;
		if (Objects.nonNull(id)) {
			Optional<Worker> optionalWorker = workerRespository.findById(id);
			if(optionalWorker.isPresent()) {
				worker = optionalWorker.get();
			}else {
				throw new RuntimeException("Worker not found with the id:"+id);
			}
		}
		
		return worker;
	}

	@Override
	public void deleteById(Long id) {
		if(Objects.nonNull(id));
		workerRespository.deleteById(id);
		
	}

//	@Override
//	public List<Worker> (Worker worker) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Worker updateWorker(Worker worker) {
		long rollNumber = worker.getEmploy_id();
		Worker work = workerRespository.findById(rollNumber).get();
		work.setEmploy_name(worker.getEmploy_name());
		work.setEmploy_surname(worker.getEmploy_surname());
		work.setEmploy_role(worker.getEmploy_role());
		work.setEmploy_team(worker.getEmploy_team());
		work.setEmploy_cellnumber(worker.getEmploy_cellnumber());
		work.setEmploy_email(worker.getEmploy_email());
		return workerRespository.save(work);
	}

	@Override
	public Worker getById(Worker worker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Worker> getWorkerByID(Worker worker) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
