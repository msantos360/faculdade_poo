package br.com.msantos.exercicioum.tests;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import br.com.msantos.exercicioum.contato.Contato;
import br.com.msantos.exercicioum.contato.RedesSociais;

public class ContatoTest {

	private Contato contato = null;

	@Before
	public void controiObjetoContato() {

		RedesSociais facebook = new RedesSociais("/maria_lucia365222", "");
		RedesSociais twitter = new RedesSociais("/maria_luciaaa", "@mariaLuciaaa");

		LinkedList<RedesSociais> redesSociais = new LinkedList<RedesSociais>();

		redesSociais.add(twitter);
		redesSociais.add(facebook);

		contato = new Contato("Maria Lucia Lopes", LocalDate.of(1990, Month.DECEMBER, 12), "(14) 3016-2699",
				"(14) 95098-5900", redesSociais);
	}

	@Test
	public void validaObjetoContatoConstruido() {
		String nomeEsperado = "Maria Lucia Lopes";
		LocalDate dataNascimentoEsperada = LocalDate.of(1990, Month.DECEMBER, 12);
		String telefoneEsperado = "(14) 3016-2699";
		String celularEsperado = "(14) 95098-5900";
		
		RedesSociais facebookEsperado = new RedesSociais("/maria_lucia365222", "");
		RedesSociais twitterEsperado = new RedesSociais("/maria_luciaaa", "@mariaLuciaaa");

		LinkedList<RedesSociais> redesSociaisEsperadas = new LinkedList<RedesSociais>();

		redesSociaisEsperadas.add(twitterEsperado);
		redesSociaisEsperadas.add(facebookEsperado);
		
		assertEquals(contato.getNome(), nomeEsperado);
		assertEquals(contato.getDataNascimento(), dataNascimentoEsperada);
		assertEquals(contato.getTelefone(), telefoneEsperado);
		assertEquals(contato.getCelular(), celularEsperado);
		assertEquals(contato.getRedesSociais(), redesSociaisEsperadas);
	}

}
