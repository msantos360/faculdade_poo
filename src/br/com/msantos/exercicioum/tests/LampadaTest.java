package br.com.msantos.exercicioum.tests;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;

import br.com.msantos.exercicioum.lampada.Lampada;
import br.com.msantos.exercicioum.lampada.LampadaBuilder;
import br.com.msantos.exercicioum.lampada.TipoLampada;

public class LampadaTest {
	
	private Lampada lampada = null;

	@Before
	public void controiObjetoLampada() {
		
		 lampada = new LampadaBuilder()
						 .ComNome("Lâmpada Fluorescente")
						 .ComDescricao("Tubular 14w 4000k Osram")
						 .ComTipoLampada(TipoLampada.Fluorescente)
						 .ComPotencia(14)
						 .ComTemperaturaDeCor(4000)
						 .ComVoltagem(110)
						 .ComTempoVidaUtil(Duration.ofDays(1460))
						 .build();
	}
	
	@Test
	public void validaObjetoLampadaConstruida() {
		
		String nomeEsperado = "Lâmpada Fluorescente";
		String descricaoEsperada = "Tubular 14w 4000k Osram";
		TipoLampada tipoLampadaEsperada = TipoLampada.Fluorescente;
		Float potenciaEsperada = Float.valueOf(14);
		Float temperaturaEsperada = Float.valueOf(4000);
		Integer voltagemEsperada = Integer.valueOf(110);
		Duration tempoVidaUtilEsperada = Duration.ofDays(1460);		
		
		System.out.println(lampada);
		
		assertEquals(lampada.getNome(), nomeEsperado);
		assertEquals(lampada.getDescricao(), descricaoEsperada);
		assertEquals(lampada.getTipoLampada(), tipoLampadaEsperada);
		assertEquals(lampada.getPotencia(), potenciaEsperada);
		assertEquals(lampada.getTemperaturaDeCor(), temperaturaEsperada);
		assertEquals(lampada.getTempoVidaUtil(), tempoVidaUtilEsperada);
		assertEquals(lampada.getVoltagem(), voltagemEsperada);
	}

}








