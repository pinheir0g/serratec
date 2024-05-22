package br.org.serratec.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.biblioteca.dtos.UsuarioDTO;
import br.org.serratec.biblioteca.entities.Usuario;
import br.org.serratec.biblioteca.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	public Usuario findById(Integer id) {
		//return usuarioRepository.findById(id).orElse(null);
		return usuarioRepository.findById(id).get();
	}

	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario saveUsuarioDto(UsuarioDTO usuarioDTO) {
		return usuarioRepository.save(new Usuario(usuarioDTO));
	}

	public Usuario update(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Usuario delete(Usuario usuario) {
		Usuario usuarioExcluido = usuarioRepository.findById(usuario.getUserId()).orElse(null);
		try {
			usuarioRepository.delete(usuarioExcluido);
			if(usuarioExcluido != null) {
				return usuarioExcluido;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return usuarioExcluido;
	}

	public Usuario deleteById(Integer id) {
		Usuario usuarioExcluido = usuarioRepository.findById(id).orElse(null);
		try {
			usuarioRepository.delete(usuarioExcluido);
			if(usuarioExcluido != null) {
				return usuarioExcluido;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return usuarioExcluido;
	}

	public long count() {
		return usuarioRepository.count();
	}
}
