package com.Crud.SpringbootApplication.Controller;

import java.util.List;

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

import com.Crud.SpringbootApplication.Model.Documents;
//import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Model.Worker;
import com.Crud.SpringbootApplication.Service.Documents.DocumentsService;
//import com.Crud.SpringbootApplication.Respository.EmployeeRespository;
//import com.Crud.SpringbootApplication.Service.Employee.EmployeeService;
import com.Crud.SpringbootApplication.Service.Worker.WorkerService;

@RestController
@CrossOrigin(origins = "http://localhost:8084",allowCredentials="true",methods = {RequestMethod.GET , RequestMethod.DELETE ,RequestMethod.PUT,  RequestMethod.POST})
@RequestMapping(value= "/api",method= {RequestMethod.GET})
@Controller

//@RestController
//@CrossOrigin(origins = "http://beta2cinerg-env.eba-imvt7tff.us-east-2.elasticbeanstalk.com",allowCredentials="true",methods = {RequestMethod.GET , RequestMethod.DELETE ,RequestMethod.PUT,  RequestMethod.POST})
//@RequestMapping(value= "/api",method= {RequestMethod.GET})
//@Controller
public class DocumentsController {
	
	@Autowired
	private DocumentsService documenetsService;
	
	//Create new employee
	@PostMapping("/createDocuments")
    public void createAndSaveDocuments(@Validated @RequestBody Documents documents) {
		documenetsService.save(documents);
	}
	//Read all
	@GetMapping("/Documents")
	public List<Documents> viewHomePage(Model model) {
		model.addAttribute("allemplist", documenetsService.getAllDocuments());
		return documenetsService.getAllDocuments();
	}
	//Read by Id
//	@GetMapping("/Worker/{employ_id}")
//	public List<Worker> getWorkerByID(@PathVariable("employ_id") long employ_id, Worker worker){
//		worker.setEmploy_id(employ_id);
//		return workerService.getWorkerByID(worker);
//	}
	//Read by Id
	@GetMapping("/Documents/{documents_id}")
	public List<Documents> getDocumentsByID(@PathVariable("documents_id") long documents_id, Documents documents){
		documents.setDocument_id(documents_id);
		return documenetsService.getDocumentsByID(documents);
	}

	//Update
	@PutMapping("/updateDocuments")
	public Documents updateDocuments(@RequestBody Documents documents) {
		return documenetsService.updateDocuments(documents);
	}
	
	//Delete Id
	@DeleteMapping("/delete/{documents_id}")
    public void deleteById(@PathVariable(value = "documents_id") long documents_id){
		documenetsService.deleteById(documents_id);
        
    }

    
}
