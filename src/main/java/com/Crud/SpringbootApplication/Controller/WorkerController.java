//package com.Crud.SpringbootApplication.Controller;
//
//import java.util.List;
//
//import javax.management.AttributeNotFoundException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
////import com.Crud.SpringbootApplication.Model.Employee;
//import com.Crud.SpringbootApplication.Model.Worker;
////import com.Crud.SpringbootApplication.Respository.EmployeeRespository;
////import com.Crud.SpringbootApplication.Service.Employee.EmployeeService;
//import com.Crud.SpringbootApplication.Service.Worker.WorkerService;
//
////hello world
////@RestController
////@CrossOrigin(origins = "http://cinerg.us-east-2.elasticbeanstalk.com/", methods = {RequestMethod.GET , RequestMethod.DELETE ,RequestMethod.PUT,  RequestMethod.POST})
////@RequestMapping(value= "api",method= {RequestMethod.GET})
////@CrossOrigin(allowedHeaders = "*", origins = "*",allowCredentials="true")
//@CrossOrigin
//@RestController
//@Controller
//public class WorkerController {
//	
//	@Autowired
//	private WorkerService workerService;
//	
//	//Create new employee
//	@PostMapping("/createWorker")
//    public void createAndSaveWorker(@Validated @RequestBody Worker worker) {
//		workerService.save(worker);
//	}
//	//Read all
//	@GetMapping("/Worker")
//	public List<Worker> viewHomePage(Model model) {
//		model.addAttribute("allemplist", workerService.getAllWorker());
//		return workerService.getAllWorker();
//	}
//	//Read by Id
////	@GetMapping("/Worker/{employ_id}")
////	public List<Worker> getWorkerByID(@PathVariable("employ_id") long employ_id, Worker worker){
////		worker.setEmploy_id(employ_id);
////		return workerService.getWorkerByID(worker);
////	}
//	
//	//Read by Id
//	@GetMapping("/Worker/{employ_id}")
//	public List<Worker> getWorkerByID(@PathVariable("employ_id") long employ_id, Worker worker){
//		worker.setEmploy_id(employ_id);
//		return workerService.getWorkerByID(worker);
//	}
//
//	//Update
//	@PutMapping("/updateWorkerform")
//	public Worker updateWorker(@RequestBody Worker worker) {
//		return workerService.updateWorker(worker);
//	}
//	
//	//Delete Id
//	@DeleteMapping("/delete/{employ_id}")
//    public void deleteById(@PathVariable(value = "employ_id") long employ_id){
//		workerService.deleteById(employ_id);
//        
//    }
//
//    
//}
