package br.org.serratec.biblioteca.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "perfil")
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "perfil_id")
	private Integer perfilId;

	@NotBlank
	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@JsonIgnore
	@OneToMany(mappedBy = "perfil")
	private List<Usuario> usuarios;

	public Perfil() {
	}

	public Perfil(Integer perfilId, String nome, String descricao) {
		this.perfilId = perfilId;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Integer getPerfilId() {
		return perfilId;
	}

	public void setPerfilId(Integer perfilId) {
		this.perfilId = perfilId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	@Override
	public String toString() {
		return "Perfil [perfilId=" + perfilId + ", nome=" + nome + ", descricao=" + descricao + ", usuarios=" + usuarios
				+ "]";
	}

}
