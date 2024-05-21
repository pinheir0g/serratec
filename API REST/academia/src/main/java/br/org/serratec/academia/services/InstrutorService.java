package br.org.serratec.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.academia.entities.Instrutor;
import br.org.serratec.academia.repositories.InstrutorRepository;

@Service
public class InstrutorService {

	@Autowired
	InstrutorRepository instrutoRepository;

	@Autowired
	InstrutorRepository instrutorRepository;

	public Instrutor save(Instrutor instrutor) {
		return instrutorRepository.save(instrutor);
	}

	public Instrutor update(Instrutor instrutor) {
		return instrutorRepository.save(instrutor);
	}

	public List<Instrutor> findAll() {
		return instrutorRepository.findAll();
	}

	public Instrutor findById(Integer id) {
		return instrutorRepository.findById(id).orElse(null);
	}

	public Instrutor deleteById(Integer id) {
		Instrutor instrutor = findById(id);
		if (instrutor != null) {
			instrutorRepository.delete(instrutor);
			return instrutor;
		}
		return instrutor;
	}
}

