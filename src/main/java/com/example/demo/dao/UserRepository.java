package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@SuppressWarnings("unchecked")
	User save(User user);
	
	//no es necesario implementar los metodos pues esta usando los metodos de JpaRepository
	//List<User> findAll();

}
