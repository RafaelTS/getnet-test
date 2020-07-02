package br.sc.rafael.core;

import static br.sc.rafael.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {

	/********* TextField e TextArea ************/

	public void escrever(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escrever(String id_campo, String texto) {
		escrever(By.id(id_campo), texto);
	}

	public String obterValorCampo(String id_campo) {
		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}


	/********* Botao ************/

	public void clicarBotao(By by) {
		getDriver().findElement(by).click();
	}

	public void clicarBotao(String id) {
		clicarBotao(By.id(id));
	}

	public void clicarBotaoPorTexto(String texto) {
		clicarBotao(By.xpath("//button[.='" + texto + "']"));
	}

	public String obterValueElemento(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	/********* Link ************/

	public void clicarLink(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}

	/********* Textos ************/

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}

}