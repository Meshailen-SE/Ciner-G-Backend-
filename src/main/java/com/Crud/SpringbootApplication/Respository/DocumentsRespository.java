package com.Crud.SpringbootApplication.Respository;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Crud.SpringbootApplication.Model.Documents;
import com.Crud.SpringbootApplication.Model.Employee;

@Repository
public interface DocumentsRespository extends JpaRepository <Documents, Long> {
	
//	List<Employee> findByTitleContaining(String name);
//	
//	List<Employee> list = new ArrayList<>();
//	public static List<Employee> getAllEmployee(){
//		return list;
//	}
	
}