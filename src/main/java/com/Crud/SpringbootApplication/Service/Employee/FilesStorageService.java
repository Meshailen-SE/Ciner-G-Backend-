package com.Crud.SpringbootApplication.Service.Employee;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;
import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Respository.EmployeeRespository;

public interface FilesStorageService {
	
	
	
	
	  public void init();

	  public void save(MultipartFile file);
	
	  public Resource load(String filename);
	
	  public void deleteAll();
	
	  public Stream<Path> loadAll();
	
	
	
}