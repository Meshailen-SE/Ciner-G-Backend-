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
import com.Crud.SpringbootApplication.Model.ResponseFile;
import com.Crud.SpringbootApplication.ResponseMessage.ResponseMessage;
import com.Crud.SpringbootApplication.Service.Employee.AddendumStorageService;
import com.Crud.SpringbootApplication.Service.Employee.AddendumStorageService;
import com.Crud.SpringbootApplication.Service.Employee.AddendumStorageServiceImpl;
import com.Crud.SpringbootApplication.Service.Employee.FooStorageService;

import org.springframework.web.multipart.MultipartFile;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;


@RestController
@CrossOrigin(origins = "http://localhost:8084",allowCredentials="true",methods = {RequestMethod.GET , RequestMethod.DELETE ,RequestMethod.PUT,  RequestMethod.POST})
@RequestMapping(value= "/api",method= {RequestMethod.GET})

//@RestController
//@CrossOrigin(origins = "http://beta2cinerg-env.eba-imvt7tff.us-east-2.elasticbeanstalk.com",allowCredentials="true",methods = {RequestMethod.GET , RequestMethod.DELETE ,RequestMethod.PUT,  RequestMethod.POST})
//@RequestMapping(value= "/api",method= {RequestMethod.GET})

public class FooController {

  @Autowired
  private FooStorageService fooStorageService;

  @PostMapping("/uploadFoo")
  public ResponseEntity<ResponseMessage> uploadFoo(@RequestParam("foo") MultipartFile foo) {
    String message = "";
    try {
    	fooStorageService.save(foo);

      message = "Uploaded the Foo successfully: " + foo.getOriginalFilename();
      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
    } catch (Exception e) {
      message = "Could not upload the Foo: " + foo.getOriginalFilename() + ". Error: " + e.getMessage();
      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
    }
  }


  @GetMapping("/foos")
  public ResponseEntity<List<Foo>> getListFoo() {
    List<Foo> foo = fooStorageService.loadAll().map(path -> {
      String filename = path.getFileName().toString();
      String url = MvcUriComponentsBuilder
          .fromMethodName(FooController.class, "getFoo", path.getFileName().toString()).build().toString();
      

      return new Foo(filename, url);
    }).collect(Collectors.toList());

    return ResponseEntity.status(HttpStatus.OK).body(foo);
  }


  @GetMapping("/foos/{filename:.+}")
  @ResponseBody
  public ResponseEntity<Resource> getFoo(@PathVariable String filename) {
    Resource foo = fooStorageService.load(filename);
    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + foo.getFilename() + "\"").body(foo);
  }

  
  
}