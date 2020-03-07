package br.com.msantos.exercicioum.contato;

public class RedesSociais {

	private String enderecoPerfil;

	private String nomeUsuario;

	public RedesSociais(String enderecoPerfil, String nomeUsuario) {
		this.enderecoPerfil = enderecoPerfil;
		this.nomeUsuario = nomeUsuario;
	}

	public String getEnderecoPerfil() {
		return enderecoPerfil;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	@Override
	public String toString() {
		return "RedesSociais [enderecoPerfil=" + enderecoPerfil + ", nomeUsuario=" + nomeUsuario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enderecoPerfil == null) ? 0 : enderecoPerfil.hashCode());
		result = prime * result + ((nomeUsuario == null) ? 0 : nomeUsuario.hashCode());
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
		RedesSociais other = (RedesSociais) obj;
		if (enderecoPerfil == null) {
			if (other.enderecoPerfil != null)
				return false;
		} else if (!enderecoPerfil.equals(other.enderecoPerfil))
			return false;
		if (nomeUsuario == null) {
			if (other.nomeUsuario != null)
				return false;
		} else if (!nomeUsuario.equals(other.nomeUsuario))
			return false;
		return true;
	}
	
	

}
