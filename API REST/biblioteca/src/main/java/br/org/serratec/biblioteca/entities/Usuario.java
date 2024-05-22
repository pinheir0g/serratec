package br.org.serratec.biblioteca.entities;

import br.org.serratec.biblioteca.dtos.UsuarioDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "user_nome")
	@NotBlank(message = "O nome não pode ser nulo")
	private String userName;

	@Column(name = "user_email", unique = true)
	@Pattern(regexp = "^[a-zA-Z0-9+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", message = "O formato esperado do email é: aaaaa@aaaa.aaaa")
	private String userEmail;

	@Column(name = "user_password")
	private String userPassword;

	@ManyToOne
	@JoinColumn(name = "perfil_id")
	private Perfil perfil;

	public Usuario() {
	}
	public Usuario(UsuarioDTO usuarioDTO) {
		this.userName = usuarioDTO.userName();
		this.userEmail = usuarioDTO.userEmail();
		this.userPassword = usuarioDTO.userPassword();
		this.perfil = usuarioDTO.perfil();
	}

	public Usuario(Integer userId, String userName, String userEmail, String userPassword, Perfil perfil) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.perfil = perfil;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
}
