package br.com.msantos.exercicioum.livro;

public abstract class Livro {

	private String titulo;

	private String autor;

	private Integer qtdePaginas;

	public Livro(String titulo, String autor, Integer qtdePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.qtdePaginas = qtdePaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Integer getQtdePaginas() {
		return qtdePaginas;
	}

}
