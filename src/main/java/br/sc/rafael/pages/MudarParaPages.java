package br.sc.rafael.pages;

import org.openqa.selenium.By;

import br.sc.rafael.core.BasePage;

public class MudarParaPages extends BasePage {
	
	public void clicarBotaoAlertSimples() {
		//clicarBotao(By.xpath("//button[@class='btn btn-danger']"));
		clicarBotao(By.xpath("//*[@id=\"OKTab\"]/button"));
		
		
	}
	
	public String lerAlert(String msg) {
		return alertaObterTexto();
	}

}
