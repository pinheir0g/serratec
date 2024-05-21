
package br.org.serratec.biblioteca.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.biblioteca.dtos.PerfilResumidoDto;
import br.org.serratec.biblioteca.entities.Perfil;
import br.org.serratec.biblioteca.repositories.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	private PerfilRepository perfilRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	EmailService emailService;

	public List<Perfil> findAll() {
		return perfilRepository.findAll();
	}
	public List<PerfilResumidoDto> findAllPerfilResumido() {
		List<Perfil> perfis = perfilRepository.findAll();
		List<PerfilResumidoDto> perfisDto = new ArrayList<>();

		for(Perfil perfil : perfis) {
			PerfilResumidoDto perfilDto = new PerfilResumidoDto();
			perfilDto.setNome(perfil.getNome());
			perfilDto.setDescricao(perfil.getDescricao());
			perfisDto.add(perfilDto);
		}
		return perfisDto;
	}

	public Perfil findById(Integer id) {
		//return perfilRepository.findById(id).orElse(null);
		return perfilRepository.findById(id).get();
	}

	public PerfilResumidoDto findByIdResumido(Integer id) {
		Perfil perfil = perfilRepository.findById(id).orElse(null);
		PerfilResumidoDto perfilDto = null;
		perfilDto = modelMapper.map(perfil, PerfilResumidoDto.class);
		emailService.enviarEmail("gv.pinheiro@outlook.com", "Cadastro de perfil",perfilDto.toString() );
		return perfilDto;
	}

	public Perfil save(Perfil perfil) {
		return perfilRepository.save(perfil);
	}

	public Perfil update(Perfil perfil) {
		return perfilRepository.save(perfil);
	}

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
			if(perfil != null)
				perfilRepository.deleteById(id);
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
