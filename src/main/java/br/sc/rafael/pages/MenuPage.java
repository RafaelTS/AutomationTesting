package br.sc.rafael.pages;

import br.sc.rafael.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarPracticeSite() {
		clicarLink("Practice Site");
	}
	
	public void acessarMudarPara() {
		clicarLink("SwitchTo");
		
	}
	
	public void acessarAlerts() {
		clicarLink("Alerts");
	}
	
	public void acessarMinhaConta() {
		clicarLink("My Account");
		
	}
	
	public void acessarShop() {
		clicarLink("Shop");
	}
	
	public void escolherSelenium() {
		clicarLink("selenium");
		
	}
}
