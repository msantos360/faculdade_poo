package br.com.msantos.exercicioum.livro;

public class EbookBuilder {

	private String titulo;

	private String autor;

	private Integer qtdePaginas;
	
	private String tipoArquivo;

	private Integer tamanhoArquivo;
	
	public Ebook build() {
		return new Ebook(titulo, autor, qtdePaginas, tipoArquivo, tamanhoArquivo);
	}
	
	public EbookBuilder comTitulo(String titulo) {
		this.titulo = titulo;
		return this;
	}
	
	public EbookBuilder comAutor(String autor) {
		this.autor = autor;
		return this;
	}
	
	public EbookBuilder comQtdePaginas(int qtdePaginas) {
		this.qtdePaginas = Integer.valueOf(qtdePaginas);
		return this;
	}
	
	public EbookBuilder comTipoArquivo(String tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
		return this;
	}
	
	public EbookBuilder comTamanhoArquivo(int tamanhoArquivo) {
		this.tamanhoArquivo =  Integer.valueOf(tamanhoArquivo);
		return this;
	}
}