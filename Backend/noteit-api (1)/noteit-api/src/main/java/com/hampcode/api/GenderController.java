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

import com.hampcode.model.Gender;
import com.hampcode.repository.GenderRepository;

@RestController
@RequestMapping("/api/gender")
public class GenderController {

	@Autowired
	private GenderRepository genderRepository;
	
	@GetMapping
	public List<Gender> all() {
		List<Gender> genders = this.genderRepository.findAll();
		return genders;
	}
	
	@PostMapping
	public Gender save(@RequestBody Gender gender, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new ValidationException();
		}

		
		Gender newGender = this.genderRepository.save(gender);

		return newGender;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		this.genderRepository.deleteById(id);
	}

}
