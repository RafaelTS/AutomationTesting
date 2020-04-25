package br.sc.rafael.tests;


import org.junit.Test;

import br.sc.rafael.core.BaseTest;
import br.sc.rafael.pages.DemoClassPage;


public class DemoClassTest extends BaseTest {
	
	DemoClassPage demoPage = new DemoClassPage();
	
	
	@Test
	public void inserirUsuario() {
		
		//Teste para acessar a página inicial e criar um novo usuário
		
		demoPage.setNome("Rafael");
		demoPage.setSobrenome("Teixeira");
		demoPage.setEmail("rafaeltorress@gmail.com");
		demoPage.setTelefone("4899999999");
		demoPage.setSexoMasculino();
		demoPage.setPais("Albania");
		demoPage.setAno("1990");
		demoPage.setMes("May");
		demoPage.setDia("2");
		demoPage.setSenhaUm("Senha!@#32");
		demoPage.setSenhaDois("Senha!@#32");
		
		demoPage.salvar();
		
		
	}

}
