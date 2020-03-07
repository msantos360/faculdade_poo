package br.com.msantos.exercicioum.lampada;

import java.time.Duration;

public class LampadaBuilder {

	private String nome;

	private String descricao;

	private Float peso;

	private Float comprimento;

	private Float largura;

	private Float profundidade;

	private Integer voltagem;

	private Float potencia;

	private Float temperaturaDeCor;

	private Duration tempoVidaUtil;

	private boolean status = false;

	private TipoLampada tipoLampada;

	public Lampada build() {
		return new Lampada(nome, descricao, peso, comprimento, largura, voltagem, profundidade, potencia,
				temperaturaDeCor, tempoVidaUtil, status, tipoLampada);
	}

	public LampadaBuilder ComNome(String nome) {
		this.nome = nome;
		return this;
	}

	public LampadaBuilder ComDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}

	public LampadaBuilder ComPeso(float peso) {
		this.peso = Float.valueOf(peso);
		return this;
	}

	public LampadaBuilder ComComprimento(float comprimento) {
		this.comprimento = Float.valueOf(comprimento);
		return this;
	}

	public LampadaBuilder ComLargura(float largura) {
		this.largura = Float.valueOf(largura);
		return this;
	}

	public LampadaBuilder ComProfundidade(float profundidade) {
		this.profundidade = Float.valueOf(profundidade);
		return this;
	}

	public LampadaBuilder ComVoltagem(Integer voltagem) {
		this.voltagem = Integer.valueOf(voltagem);
		return this;
	}

	public LampadaBuilder ComPotencia(float potencia) {
		this.potencia = Float.valueOf(potencia);
		return this;
	}

	public LampadaBuilder ComTemperaturaDeCor(float temperaturaDeCor) {
		this.temperaturaDeCor = Float.valueOf(temperaturaDeCor);
		return this;
	}

	public LampadaBuilder ComTempoVidaUtil(Duration tempoVidaUtil) {
		this.tempoVidaUtil = tempoVidaUtil;
		return this;
	}

	public LampadaBuilder ComStatus(boolean status) {
		this.status = status;
		return this;
	}

	public LampadaBuilder ComTipoLampada(TipoLampada tipoLampada) {
		this.tipoLampada = tipoLampada;
		return this;
	}

}
