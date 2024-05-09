package br.org.serratec.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.biblioteca.entities.Perfil;
import br.org.serratec.biblioteca.services.PerfilService;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

	@Autowired
	PerfilService perfilService;


	@PostMapping
	public Perfil cadastrarPerfil(@RequestBody Perfil perfil) {
		return perfilService.save(perfil);
	}
	@GetMapping
	public List<Perfil> verPerfil() {
		return perfilService.findAll();
	}

	@DeleteMapping
	public String deletePerfil(@RequestBody Perfil perfil) {
		return perfilService.delete(perfil);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Integer> deletePerfilById(@PathVariable Integer id) {
		if(perfilService.deleteById(id)) {
			return ResponseEntity.ok(id);
		}
		return ResponseEntity.notFound().build();
	}
}
