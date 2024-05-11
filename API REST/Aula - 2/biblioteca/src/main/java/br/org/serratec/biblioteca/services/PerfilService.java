
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
		return perfilRepository.findById(id).orElse(null);
	}

	public Perfil save(Perfil perfil) {
		return perfilRepository.save(perfil);
	}

	public Perfil update(Perfil perfil) {
		return perfilRepository.save(perfil);
	}

	// Exercicio para casa: Implementar uma forma de retornar o resultado da
	// deleção, retornando se o perfil foi deletado com sucesso ou não.

	public Perfil delete(Perfil perfil) {
		Perfil perfilExcluido = perfilRepository.findById(perfil.getPerfilId()).orElse(null);
		try {
			perfilRepository.delete(perfilExcluido);
			if(perfil != null)
				return perfilExcluido;
		}catch(Exception e) {
			System.out.println(e);
		}
		return perfilExcluido;
	}

	public Perfil deleteById(Integer id) {
		Perfil perfil = perfilRepository.findById(id).orElse(null);
		try {
			perfilRepository.deleteById(id);
			if(perfil != null)
				return perfil;

		}catch(Exception e) {
			System.out.println(e);
		}
		return perfil;
	}

	// Retorna a quantidade de registros na tabela
	public long count() {
		return perfilRepository.count();
	}

}
