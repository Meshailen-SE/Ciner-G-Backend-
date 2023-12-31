//package com.Crud.SpringbootApplication.Service.User;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.swing.JList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.Crud.SpringbootApplication.Model.Documents;
//import com.Crud.SpringbootApplication.Model.Employee;
//import com.Crud.SpringbootApplication.Model.User;
//import com.Crud.SpringbootApplication.Model.Role;
//import com.Crud.SpringbootApplication.Respository.EmployeeRespository;
//import com.Crud.SpringbootApplication.Respository.UserRepository;
////import org.springframework.security;
////import com.springboot.blog.entity.User;
////import com.springboot.blog.repository.UserRepository;
////import org.springframework.security.core.GrantedAuthority;
////import org.springframework.security.core.authority.SimpleGrantedAuthority;
////import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private UserRepository userRepository;
//
//    public CustomUserDetailsService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
//          User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
//                 .orElseThrow(() ->
//                         new UsernameNotFoundException("User not found with username or email: "+ usernameOrEmail));
//
//        Set<GrantedAuthority> authorities = user.getRoles().stream().map((role) -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toSet());
//
//        return new org.springframework.security.core.userdetails.User(user.getEmail(),
//                user.getPassword(),
//                authorities);
//    }
//}