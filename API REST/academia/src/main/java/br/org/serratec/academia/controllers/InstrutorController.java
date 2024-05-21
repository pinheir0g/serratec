package br.org.serratec.academia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.academia.entities.Instrutor;
import br.org.serratec.academia.services.InstrutorService;

@RestController
@RequestMapping("/instrutor")
public class InstrutorController {

	@Autowired
	InstrutorService instrutorService;

	@PostMapping
	public ResponseEntity<Instrutor> save(@RequestBody Instrutor instrutor) {
		return ResponseEntity.status(HttpStatus.CREATED).body(instrutorService.save(instrutor));
	}

	@PutMapping
	public ResponseEntity<Instrutor> update(@RequestBody Instrutor instrutor) {
		return ResponseEntity.status(HttpStatus.OK).body(instrutorService.update(instrutor));
	}

	@GetMapping
	public ResponseEntity<List<Instrutor>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(instrutorService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Instrutor> findById(@PathVariable Integer id) {
		return ResponseEntity.status(HttpStatus.OK).body(instrutorService.findById(id));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Integer id) {
		if (instrutorService.findById(id) != null) {
			return ResponseEntity.status(HttpStatus.OK).body(instrutorService.deleteById(id));
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{'Error': 'Instrutor não encontrada'}");
	}
}
