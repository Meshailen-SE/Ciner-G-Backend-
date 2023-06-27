package com.Crud.SpringbootApplication.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Crud.SpringbootApplication.Model.AddendumInfo;
import com.Crud.SpringbootApplication.Model.Contracts;
import com.Crud.SpringbootApplication.Model.Foo;
import com.Crud.SpringbootApplication.Model.ResponseFile;
import com.Crud.SpringbootApplication.ResponseMessage.ResponseMessage;
import com.Crud.SpringbootApplication.Service.Employee.AddendumStorageService;
import com.Crud.SpringbootApplication.Service.Employee.AddendumStorageService;
import com.Crud.SpringbootApplication.Service.Employee.AddendumStorageServiceImpl;
import com.Crud.SpringbootApplication.Service.Employee.ContractsStorageService;
import com.Crud.SpringbootApplication.Service.Employee.FooStorageService;

import org.springframework.web.multipart.MultipartFile;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;



@RestController
@CrossOrigin(origins = "http://localhost:8084",allowCredentials="true",methods = {RequestMethod.GET , RequestMethod.DELETE ,RequestMethod.PUT,  RequestMethod.POST})
@RequestMapping(value= "/api",method= {RequestMethod.POST,RequestMethod.GET})

//@RestController
//@CrossOrigin(origins = "http://beta2cinerg-env.eba-imvt7tff.us-east-2.elasticbeanstalk.com",allowCredentials="true",methods = {RequestMethod.GET , RequestMethod.DELETE ,RequestMethod.PUT,  RequestMethod.POST})
//@RequestMapping(value= "/api",method= {RequestMethod.POST,RequestMethod.GET})

public class ContractsController {

  @Autowired
  private ContractsStorageService contractsStorageService;

  @PostMapping("/uploadContracts")
  public ResponseEntity<ResponseMessage> uploadContracts(@RequestParam("contracts") MultipartFile contracts) {
    String message = "";
    try {
    	contractsStorageService.save(contracts);

      message = "Uploaded the Contract successfully: " + contracts.getOriginalFilename();
      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
    } catch (Exception e) {
      message = "Could not upload the Contract: " + contracts.getOriginalFilename() + ". Error: " + e.getMessage();
      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
    }
  }


  @GetMapping("/contractss")
  public ResponseEntity<List<Contracts>> getListContracts() {
    List<Contracts> contracts = contractsStorageService.loadAll().map(path -> {
      String filename = path.getFileName().toString();
      String url = MvcUriComponentsBuilder
          .fromMethodName(ContractsController.class, "getContracts", path.getFileName().toString()).build().toString();
      

      return new Contracts(filename, url);
    }).collect(Collectors.toList());

    return ResponseEntity.status(HttpStatus.OK).body(contracts);
  }


  @GetMapping("/contractss/{filename:.+}")
  @ResponseBody
  public ResponseEntity<Resource> getContracts(@PathVariable String filename) {
    Resource contracts = contractsStorageService.load(filename);
    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + contracts.getFilename() + "\"").body(contracts);
  }

  
  
}