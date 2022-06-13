package br.sc.rafael.pages;

import org.openqa.selenium.By;

import br.sc.rafael.core.BasePage;

public class DemoClassPage extends BasePage {

//	coloquei diversos tipos de busca por seletores, não mantendo padrão, para demonstrar que faço as buscas de várias formas.
//	Caso fosse escolher um padrão, a sugestão é sempre fazer sem xpath,ou, com um xpath mais limpo possível.
	public void setNome(String nome) {
		escrever(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"), nome);

	}

	public void setSobrenome(String sobrenome) {
		escrever(By.xpath("//input[@placeholder=\"Last Name\"]"), sobrenome);

	}

	public void setEmail(String email) {
		escrever(By.xpath("//input[@ng-model='EmailAdress']"), email);
	}

	public void setTelefone(String telefone) {
		escrever(By.xpath("//input[@type=\"tel\"]"), telefone);
	}

	public void setSexoMasculino() {
		clicarRadio(By.xpath("//input[@value='Male']"));

	}

	public void setPais(String pais) {
		selecionarCombo("countries", pais);
	}
	
	public void setAno(String ano) {
		selecionarCombo("yearbox", ano);
		
	}
	
	public void setMes(String mes) {
		selecionarCombo(By.xpath("//select[@placeholder='Month']"), mes);
		
	}

	public void setDia(String dia) {
		selecionarCombo("daybox", dia);
	
	}
	
	public void setSenhaUm(String senha1) {
		escrever("firstpassword", senha1);
	}
	
	public void setSenhaDois(String senha2) {
		escrever("secondpassword", senha2);
	}
	
	public void salvar() {
		clicarBotao("submitbtn");
	}

}
