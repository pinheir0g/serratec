package br.org.serratec.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.biblioteca.entities.Perfil;
import br.org.serratec.biblioteca.repositories.PerfilRepository;

@Service
public class PerfilService {
	@Autowired
	private PerfilRepository perfilRepository;

	public List<Perfil> findAll() {
		return perfilRepository.findAll();
	}

	public Perfil findById(Integer id) {
		return perfilRepository.findById(id).orElseGet(null);
	}

	public Perfil save(Perfil perfil) {
		return perfilRepository.save(perfil);
	}

	public Perfil update(Perfil perfil) {
		return perfilRepository.save(perfil);
	}

	public String delete(Perfil perfil) {
		if(perfilRepository.existsById(perfil.getPerfilId())) {
			try {
				perfilRepository.delete(perfil);
				return "204 OK Deletado com sucesso!";

			}catch(Exception e){
				System.out.println(e);
			}
		}
		return "404 Not Found Perfil não encontrado";
	}


	public boolean deleteById(Integer id) {
		if(perfilRepository.existsById(id)) {
			perfilRepository.deleteById(id);
			return true;
		}
		return false;
	}

	// Exercicio para casa: Implementar uma forma de retornar o resultado da
	// deleção, retornando se o perfil foi deletado com sucesso ou não.

	// Retorna a quantidade de registros na tabela
	public long count() {
		return perfilRepository.count();
	}

}
