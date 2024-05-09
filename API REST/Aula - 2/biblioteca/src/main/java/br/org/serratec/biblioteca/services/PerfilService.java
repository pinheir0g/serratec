package br.org.serratec.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
		try {
			perfilRepository.delete(perfil);
			return "Deletado com sucesso!";

		}catch(Exception e){
			System.out.println(e);
		}
		return "Perfil não encontrado";
	}

	public void deleteById(Integer id) {
		perfilRepository.deleteById(id);
	}

	// Exercicio para casa: Implementar uma forma de retornar o resultado da
	// deleção, retornando se o perfil foi deletado com sucesso ou não.

	// Retorna a quantidade de registros na tabela
	public long count() {
		return perfilRepository.count();
	}

}
