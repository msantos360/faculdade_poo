package br.com.msantos.exercicioum.livro;

public class Ebook extends Livro {

	private String tipoArquivo;

	private Integer tamanhoArquivo;

	public Ebook(String titulo, String autor, Integer qtdePaginas, String tipoArquivo, Integer tamanhoArquivo) {
		super(titulo, autor, qtdePaginas);

		this.tipoArquivo = tipoArquivo;
		this.tamanhoArquivo = tamanhoArquivo;
	}

	public String getTipoArquivo() {
		return tipoArquivo;
	}

	public Integer getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	@Override
	public String toString() {
		return "Ebook [tipoArquivo=" + tipoArquivo + ", tamanhoArquivo=" + tamanhoArquivo + "]";
	}

}
