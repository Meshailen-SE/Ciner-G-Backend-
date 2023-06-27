package com.Crud.SpringbootApplication.Respository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.JList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Crud.SpringbootApplication.Model.Employee;
import com.Crud.SpringbootApplication.Model.User;
import com.Crud.SpringbootApplication.Model.Worker;
import com.Crud.SpringbootApplication.Model.Documents;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.bezkoder.spring.login.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);

Object findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail2);
}