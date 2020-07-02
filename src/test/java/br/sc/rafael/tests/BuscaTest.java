package br.sc.rafael.tests;

import org.junit.Assert;
import org.junit.Test;

import br.sc.rafael.core.BaseTeste;
import br.sc.rafael.pages.BuscaPage;


public class BuscaTest extends BaseTeste {
	
	BuscaPage busca = new BuscaPage();
	
	@Test
	public void buscarGetnet () {
		busca.buscar();
		busca.setBusca("superget");
		busca.efetuarBusca();
		
		Assert.assertEquals("Resultados da busca para: superget", busca.obterMensagemSucessoBusca());
		
		busca.fecharPropaganda();
		busca.acessarCriarNovaConta();
		Assert.assertEquals("Como posso abrir uma conta SuperGet?", busca.obterMensagemCriarConta());
		
	}
	
}
