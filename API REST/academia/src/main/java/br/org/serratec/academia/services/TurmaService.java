package br.org.serratec.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.academia.entities.Turma;
import br.org.serratec.academia.repositories.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	TurmaRepository turmaRepository;

	public Turma save(Turma turma) {
		return turmaRepository.save(turma);
	}

	public Turma update(Turma turma) {
		return turmaRepository.save(turma);
	}

	public List<Turma> findAll() {
		return turmaRepository.findAll();
	}

	public Turma findById(Integer id) {
		return turmaRepository.findById(id).orElse(null);
	}

	public Turma deleteById(Integer id) {
		Turma turma = findById(id);
		if (turma != null) {
			turmaRepository.delete(turma);
			return turma;
		}
		return turma;
	}
}

