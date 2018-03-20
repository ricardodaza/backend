package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {

	/**
	 * Guarda un usuario
	 * @param user
	 * @return el usuario guardado
	 */
	User save(User user);

	/*
	 * Recupera la lista de usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();

	/**
	 * elimina un usuario con el id recibido
	 * @param id
	 */
	void deleteUser(Long id);


}
