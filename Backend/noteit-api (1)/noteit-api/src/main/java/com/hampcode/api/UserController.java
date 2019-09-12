package com.hampcode.api;

import java.util.List;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hampcode.model.User;
import com.hampcode.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	
	@GetMapping
	public List<User> all() {
		List<User> users = this.userRepository.findAll();
		return users;
	}
	
	// Obtener usuario según id
	@GetMapping("/{id}") 
	public User getUserById(@PathVariable Long id) {
		User user = this.userRepository.findById(id).get();
		
		return user;
	}

	@PostMapping
	public User save(@RequestBody User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new ValidationException();
		}

		User newUser = this.userRepository.save(user);
		return newUser;
	}
	
	// Eliminar usuario
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		this.userRepository.deleteById(id);
	}

}
