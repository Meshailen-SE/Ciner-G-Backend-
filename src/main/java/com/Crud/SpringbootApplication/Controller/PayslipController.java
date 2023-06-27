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
import com.Crud.SpringbootApplication.Model.Foo;
import com.Crud.SpringbootApplication.Model.Payslip;
import com.Crud.SpringbootApplication.Model.ResponseFile;
import com.Crud.SpringbootApplication.ResponseMessage.ResponseMessage;
import com.Crud.SpringbootApplication.Service.Employee.AddendumStorageService;
import com.Crud.SpringbootApplication.Service.Employee.AddendumStorageService;
import com.Crud.SpringbootApplication.Service.Employee.AddendumStorageServiceImpl;
import com.Crud.SpringbootApplication.Service.Employee.FooStorageService;
import com.Crud.SpringbootApplication.Service.Employee.PayslipStorageService;

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

public class PayslipController {

  @Autowired
  private PayslipStorageService payslipStorageService;

  @PostMapping("/uploadPayslip")
  public ResponseEntity<ResponseMessage> uploadPayslip(@RequestParam("payslip") MultipartFile payslip) {
    String message = "";
    try {
    	payslipStorageService.save(payslip);

      message = "Uploaded the Payslip successfully: " + payslip.getOriginalFilename();
      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
    } catch (Exception e) {
      message = "Could not upload the Payslip: " + payslip.getOriginalFilename() + ". Error: " + e.getMessage();
      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
    }
  }


  @GetMapping("/payslips")
  public ResponseEntity<List<Payslip>> getListPayslip() {
    List<Payslip> payslip = payslipStorageService.loadAll().map(path -> {
      String filename = path.getFileName().toString();
      String url = MvcUriComponentsBuilder
          .fromMethodName(PayslipController.class, "getPayslip", path.getFileName().toString()).build().toString();
      

      return new Payslip(filename, url);
    }).collect(Collectors.toList());

    return ResponseEntity.status(HttpStatus.OK).body(payslip);
  }


  @GetMapping("/payslips/{filename:.+}")
  @ResponseBody
  public ResponseEntity<Resource> getPayslip(@PathVariable String filename) {
    Resource payslip = payslipStorageService.load(filename);
    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + payslip.getFilename() + "\"").body(payslip);
  }

  
  
}