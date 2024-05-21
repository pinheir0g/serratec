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

import br.org.serratec.academia.entities.Turma;
import br.org.serratec.academia.services.TurmaService;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

	@Autowired
	TurmaService turmaService;

	@PostMapping
	public ResponseEntity<Turma> save(@RequestBody Turma turma) {
		return ResponseEntity.status(HttpStatus.CREATED).body(turmaService.save(turma));
	}

	@PutMapping
	public ResponseEntity<Turma> update(@RequestBody Turma turma) {
		return ResponseEntity.status(HttpStatus.OK).body(turmaService.update(turma));
	}

	@GetMapping
	public ResponseEntity<List<Turma>> findAll() {
		return ResponseEntity.status(HttpStatus.OK).body(turmaService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Turma> findById(@PathVariable Integer id) {
		return ResponseEntity.status(HttpStatus.OK).body(turmaService.findById(id));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Integer id) {
		if (turmaService.findById(id) != null) {
			return ResponseEntity.status(HttpStatus.OK).body(turmaService.deleteById(id));
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{'Error': 'Turma não encontrada'}");
	}
}
