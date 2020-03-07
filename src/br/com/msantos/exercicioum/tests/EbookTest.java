package br.com.msantos.exercicioum.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.msantos.exercicioum.livro.Ebook;
import br.com.msantos.exercicioum.livro.EbookBuilder;

public class EbookTest {
	
	private Ebook ebook = null;
	
	@Before
	public void controiObjetoEbook() {
		
		ebook = new EbookBuilder()
						.comTitulo("O Senhor dos Anéis: A Sociedade do Anel")
						.comAutor("J.R.R. Tolkien")
						.comQtdePaginas(576)
						.comTipoArquivo("PDF")
						.comTamanhoArquivo(1256)
						.build();
	}

	@Test
	public void validaObjetoEbookConstruido() {
		
		String tituloEsperado = "O Senhor dos Anéis: A Sociedade do Anel";
		String autorEsperado = "J.R.R. Tolkien";
		Integer qtdePaginasEsperada = Integer.valueOf(576);
		String tipoArquivoEsperado = "PDF";
		Integer tamanhoArquivoesperado = Integer.valueOf(1256);
		
		assertEquals(ebook.getTitulo(), tituloEsperado);
		assertEquals(ebook.getAutor(), autorEsperado);
		assertEquals(ebook.getQtdePaginas(), qtdePaginasEsperada);
		assertEquals(ebook.getTipoArquivo(), tipoArquivoEsperado);
		assertEquals(ebook.getTamanhoArquivo(), tamanhoArquivoesperado);
	}

}
