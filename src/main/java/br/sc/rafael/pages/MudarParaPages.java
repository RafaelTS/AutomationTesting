package br.sc.rafael.pages;

import org.openqa.selenium.By;

import br.sc.rafael.core.BasePage;

public class MudarParaPages extends BasePage {
	
	public void clicarBotaoAlertSimples() {
		
		clicarBotao(By.xpath("//*[@id=\"OKTab\"]/button"));
		
	}
		
}
