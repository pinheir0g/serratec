package br.org.serratec.biblioteca.controllers;

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

import br.org.serratec.biblioteca.dtos.PerfilResumidoDto;
import br.org.serratec.biblioteca.entities.Perfil;
import br.org.serratec.biblioteca.services.PerfilService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/perfis")
public class PerfilController {

	@Autowired
	PerfilService perfilService;

	@GetMapping
	public ResponseEntity<List<Perfil>> findAll() {
		return new ResponseEntity<>(perfilService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/perfil-resumido")
	public ResponseEntity<List<PerfilResumidoDto>> findAllPerfilResumido() {
		return new ResponseEntity<>(perfilService.findAllPerfilResumido(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Perfil> findById(@PathVariable Integer id) {
		Perfil perfil = perfilService.findById(id);

		//if (perfil == null) {
			//return new ResponseEntity<>(perfil, HttpStatus.NOT_FOUND);
		//}
		return ResponseEntity.ok(perfil);
	}

	@GetMapping("/perfil-resumido/{id}")
	public ResponseEntity<PerfilResumidoDto> findByIdResumido(@PathVariable Integer id) {
		PerfilResumidoDto perfilDto = null;
		perfilDto = perfilService.findByIdResumido(id);
		if (perfilDto == null) {
			return new ResponseEntity<>(perfilDto, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(perfilDto, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Perfil> savePerfil(@RequestBody @Valid Perfil perfil) {
		return new ResponseEntity<>(perfilService.save(perfil), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Perfil> updatePerfil(@RequestBody @Valid Perfil perfil) {
		return new ResponseEntity<>(perfilService.update(perfil), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<Perfil> deletePerfil(@RequestBody Perfil perfil) {
		try {
			if (perfilService.findById(perfil.getPerfilId()) != null) {
				return ResponseEntity.status(HttpStatus.OK).body(perfilService.delete(perfil));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(perfilService.delete(perfil));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Perfil> deletePerfilById(@PathVariable Integer id) {
		Perfil perfilDeletado = perfilService.deleteById(id);
		try {
			if (perfilDeletado != null) {
				return new ResponseEntity<>(perfilDeletado, HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(perfilDeletado, HttpStatus.NOT_FOUND);
	}
/**
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<?> handleIllegalArgumentException(IllegalArgumentException exception, WebRequest request) {
		ProblemDetail pd = ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR,
				"Ocorreu um erro: '" + exception.getLocalizedMessage());
		pd.setType(URI.create("http://localhost:8080/errors/internal-server-error"));
		pd.setTitle("Erro Interno");
		pd.setProperty("hostname", "localhost");
		return ResponseEntity.status(500).body(pd);
	}
/**/
}
