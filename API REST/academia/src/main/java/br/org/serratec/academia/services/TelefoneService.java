package br.org.serratec.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.academia.entities.Telefone;
import br.org.serratec.academia.repositories.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	TelefoneRepository TelefoneRepository;

	@Autowired
	TelefoneRepository telefoneRepository;

	public Telefone save(Telefone telefone) {
		return telefoneRepository.save(telefone);
	}

	public Telefone update(Telefone telefone) {
		return telefoneRepository.save(telefone);
	}

	public List<Telefone> findAll() {
		return telefoneRepository.findAll();
	}

	public Telefone findById(Integer id) {
		return telefoneRepository.findById(id).orElse(null);
	}

	public Telefone deleteById(Integer id) {
		Telefone telefone = findById(id);
		if (telefone != null) {
			telefoneRepository.delete(telefone);
			return telefone;
		}
		return telefone;
	}

}
