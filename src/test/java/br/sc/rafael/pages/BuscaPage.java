package br.sc.rafael.pages;

import org.openqa.selenium.By;

import br.sc.rafael.core.BasePage;

public class BuscaPage extends BasePage {
	
	public void buscar() {
		clicarBotao("search-trigger");
				
	}	
	
	public void setBusca(String busca) {
		escrever(By.id("global-search-input"), busca);
	}
	
	public void efetuarBusca() {
		clicarBotao(By.xpath("//*[@class='o-btn o-btn--cor-roxo-borda c-search-box__button']"));
		
	}
	
	public String obterMensagemSucessoBusca(){
		return obterTexto(By.xpath("//h2[@class='c-search-page__title']"));
	}
	
	public void fecharPropaganda () {
		clicarBotao(By.xpath("//*[@class='o-fixed-footer-slot__close js-fixed-footer-slot__close']"));
	}
	
	public void acessarCriarNovaConta() {
		clicarLink("Como posso abrir uma conta SuperGet?");
		
	}
	public String obterMensagemCriarConta() {
		return obterTexto(By.xpath("//div[@data-modal='10774']/div[@class='o-modal__title']"));
	}

}
