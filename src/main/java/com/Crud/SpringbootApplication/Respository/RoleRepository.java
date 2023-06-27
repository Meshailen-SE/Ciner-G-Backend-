package com.Crud.SpringbootApplication.Respository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.JList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Model.Role;
import com.Crud.SpringbootApplication.Model.User;
import com.Crud.SpringbootApplication.Model.Worker;
import com.Crud.SpringbootApplication.Model.Documents;
import com.Crud.SpringbootApplication.Model.ERole;

//import com.springboot.blog.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
//import com.springboot.blog.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}