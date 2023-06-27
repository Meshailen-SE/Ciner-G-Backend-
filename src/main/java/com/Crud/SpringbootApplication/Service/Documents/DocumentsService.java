package com.Crud.SpringbootApplication.Service.Documents;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import com.Crud.SpringbootApplication.Model.Documents;
import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Respository.EmployeeRespository;

public interface DocumentsService {
	
	
	
	
	public List<Documents> getAllDocuments();
	public List<Documents> getDocumentsByID(Documents documents);
	void save(Documents documents);
	public Documents updateDocuments(Documents documents);
	Documents getById(Documents documents);
	
	void deleteById(Long id);
	Documents getById(Long id);
	
	
	
}