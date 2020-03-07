package br.com.msantos.exercicioum.contato;

import java.time.LocalDate;
import java.util.LinkedList;

public class Contato {

	private String nome;

	private LocalDate dataNascimento;

	private String telefone;

	private String celular;

	private LinkedList<RedesSociais> redesSociais = new LinkedList<RedesSociais>();

	public Contato(String nome, LocalDate dataNascimento, String telefone, String celular,
			LinkedList<RedesSociais> redesSociais) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.celular = celular;
		this.redesSociais = redesSociais;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCelular() {
		return celular;
	}

	public LinkedList<RedesSociais> getRedesSociais() {
		return redesSociais;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone + ", celular="
				+ celular + ", redesSociais=" + redesSociais + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((redesSociais == null) ? 0 : redesSociais.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (redesSociais == null) {
			if (other.redesSociais != null)
				return false;
		} else if (!redesSociais.equals(other.redesSociais))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

}
