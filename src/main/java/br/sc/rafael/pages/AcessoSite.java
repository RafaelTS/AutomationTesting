package br.sc.rafael.pages;

import static br.sc.rafael.core.DriverFactory.getDriver;

import br.sc.rafael.core.BasePage;

public class AcessoSite extends BasePage {

	public void acessarTelaPrincipal() {
		getDriver().get("http://demo.automationtesting.in/Register.html");
	}
	
}
