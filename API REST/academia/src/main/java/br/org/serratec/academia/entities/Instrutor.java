package br.org.serratec.academia.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "instrutor")
public class Instrutor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "instrutor_id")
	private Integer instrutorId;

	@Column(name = "rg")
	private String rg;

	@Column(name = "nome_instrutor")
	private String nomeInstrutor;

	@OneToOne(mappedBy = "instrutor")
	private Telefone telefone;

	@OneToMany(mappedBy = "instrutor")
	private List<Turma> turmas;

	public Instrutor() {
	}

	public Instrutor(Integer instrutorId, String rg, String nomeInstrutor, Telefone telefone) {
		this.instrutorId = instrutorId;
		this.rg = rg;
		this.nomeInstrutor = nomeInstrutor;
		this.telefone = telefone;
	}

	public Integer getInstrutorId() {
		return instrutorId;
	}

	public void setInstrutorId(Integer instrutorId) {
		this.instrutorId = instrutorId;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeInstrutor() {
		return nomeInstrutor;
	}

	public void setNomeInstrutor(String nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

}
