package br.com.msantos.exercicioum.lampada;

import java.time.Duration;

public class Lampada extends Produto implements NormasCertificados {

	private Integer voltagem;

	private Float potencia;

	private Float temperaturaDeCor;

	private Duration tempoVidaUtil;

	private boolean status;

	private TipoLampada tipoLampada;

	public Lampada(String nome, String descricao, Float peso, Float comprimento, Float largura, Integer voltagem,
			Float profundidade, Float potencia, Float temperaturaDeCor, Duration tempoVidaUtil, boolean status,
			TipoLampada tipoLampada) {

		super(nome, descricao, peso, comprimento, largura, profundidade);

		this.voltagem = voltagem;
		this.potencia = potencia;
		this.temperaturaDeCor = temperaturaDeCor;
		this.tempoVidaUtil = tempoVidaUtil;
		this.status = status;
		this.tipoLampada = tipoLampada;
	}

	public void acendeLampada() {
		this.status = true;
	}

	public void desligaLampada() {
		this.status = false;
	}

	public boolean isStatus() {
		return status;
	}

	public Integer getVoltagem() {
		return voltagem;
	}

	public Float getPotencia() {
		return potencia;
	}

	public TipoLampada getTipoLampada() {
		return tipoLampada;
	}

	public Float getTemperaturaDeCor() {
		return temperaturaDeCor;
	}

	public Duration getTempoVidaUtil() {
		return tempoVidaUtil;
	}

	@Override
	public String tipoCertificado() {
		return "Produto certificado pelo Inmetro";
	}

	@Override
	public String toString() {
		return "Lampada [voltagem=" + voltagem + "V, potencia=" + potencia + "W, temperaturaDeCor=" + temperaturaDeCor
				+ "K, tempoVidaUtil=" + tempoVidaUtil + "]";
	}

}