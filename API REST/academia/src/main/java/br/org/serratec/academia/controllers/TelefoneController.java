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

import br.org.serratec.academia.entities.Telefone;
import br.org.serratec.academia.services.TelefoneService;

@RestController
@RequestMapping("/telefones")
public class TelefoneController {

	@Autowired
	TelefoneService telefoneService;

	@PostMapping
	public ResponseEntity<Telefone> save(@RequestBody Telefone telefone) {
		return ResponseEntity.status(HttpStatus.CREATED).body(telefoneService.save(telefone));
	}

	@PutMapping
	public ResponseEntity<Telefone> update(@RequestBody Telefone telefone) {
		return ResponseEntity.status(HttpStatus.OK).body(telefoneService.update(telefone));
	}

	@GetMapping
	public ResponseEntity<List<Telefone>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(telefoneService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Telefone> findById(@PathVariable Integer id) {
		return ResponseEntity.status(HttpStatus.OK).body(telefoneService.findById(id));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Integer id) {
		if (telefoneService.findById(id) != null) {
			return ResponseEntity.status(HttpStatus.OK).body(telefoneService.deleteById(id));
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{'Error': 'Telefone não encontrado'}");
	}
}