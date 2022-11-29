package br.com.erudio.controller;

import br.com.erudio.data.vo.v1.PersonVO;
import br.com.erudio.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/person/v1")
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public PersonVO getById(@PathVariable(value = "id") Long id){

		return personService.getById(id);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PersonVO> getAllPersonVO() {

		return personService.findAll();
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
				 consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PersonVO> create(@RequestBody PersonVO person){
		 personService.create(person);
		 return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public PersonVO update(@RequestBody PersonVO person){
		return personService.update(person);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<PersonVO> delete(@PathVariable(value = "id") Long id){
		personService.delete(id);
		return ResponseEntity.noContent().build();
	}


}
