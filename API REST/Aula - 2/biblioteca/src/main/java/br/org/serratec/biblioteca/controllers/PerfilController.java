package br.org.serratec.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		try {
			perfilService.delete(perfil);
			return "Deletado com sucesso!";
		}catch(Exception e){
			System.out.println(e);
		}
		return "Perfil não encontrado";
	}

}
