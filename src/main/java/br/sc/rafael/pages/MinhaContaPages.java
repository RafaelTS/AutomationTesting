package br.sc.rafael.pages;

import org.openqa.selenium.By;

import br.sc.rafael.core.BasePage;

public class MinhaContaPages extends BasePage {
	
	public void setUsuario (String usuario) {
		escrever("username", usuario);
	}
	
	public void setSenha(String senha) {
		escrever("password", senha);
	}
	
	public void clicarLogin() {
		clicarBotao(By.xpath("//input[@name='login']"));
	}

}
