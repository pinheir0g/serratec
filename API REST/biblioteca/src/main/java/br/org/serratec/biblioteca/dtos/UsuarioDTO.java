package br.org.serratec.biblioteca.dtos;

import br.org.serratec.biblioteca.entities.Perfil;

public record UsuarioDTO(String userName, String userEmail, String userPassword, Perfil perfil) {

}
