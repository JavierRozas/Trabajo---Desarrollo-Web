package com.hampcode.api;

import java.util.List;


import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hampcode.Mapper;
import com.hampcode.api.viewmodel.NotebookViewModel;
import com.hampcode.model.Notebook;
import com.hampcode.repository.NotebookRepository;


@RestController
@RequestMapping("/api/notebooks")

public class NotebookController {

	@Autowired
	private NotebookRepository notebookRepository;
	
	@Autowired
    private Mapper mapper;

   
    @GetMapping
    public List<Notebook> all() {
    	List<Notebook> notebooks = this.notebookRepository.findAll();
        return notebooks;
    }

    @PostMapping
    public Notebook save(@RequestBody NotebookViewModel notebookViewModel,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ValidationException();
        }

        Notebook notebook = this.mapper.convertToNotebookEntity(notebookViewModel);

        // save notebookEntity instance to db
        this.notebookRepository.save(notebook);

        return notebook;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.notebookRepository.deleteById(id);
    }

}
