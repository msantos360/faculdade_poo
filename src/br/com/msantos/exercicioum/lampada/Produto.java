package br.com.msantos.exercicioum.lampada;

public abstract class Produto {

	private String nome;

	private String descricao;

	private Float peso;

	private Float comprimento;

	private Float largura;

	private Float profundidade;

	public Produto(String nome, String descricao, Float peso, Float comprimento, Float largura, Float profundidade) {
		this.nome = nome;
		this.descricao = descricao;
		this.peso = peso;
		this.comprimento = comprimento;
		this.largura = largura;
		this.profundidade = profundidade;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Float getPeso() {
		return peso;
	}

	public Float getComprimento() {
		return comprimento;
	}

	public Float getLargura() {
		return largura;
	}

	public Float getProfundidade() {
		return profundidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + "]";
	}

}
