package br.sc.rafael.tests;

import org.junit.Assert;
import org.junit.Test;

import br.sc.rafael.core.BaseTest;
import br.sc.rafael.pages.MenuPage;
import br.sc.rafael.pages.MinhaContaPages;


public class MinhaContaTests extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	MinhaContaPages minhaConta = new MinhaContaPages();
	
	@Test
	public void Login() {
		menuPage.acessarPracticeSite();
		menuPage.acessarMinhaConta();
		
		minhaConta.setUsuario("rafaeltorress@gmail.com");
		minhaConta.setSenha("Conta!@#32");
		minhaConta.clicarLogin();
		
		Assert.assertEquals("Hello rafaeltorress (not rafaeltorress? Sign out)\n"  
				+ "From your account dashboard you can view your recent orders,"
				+ " manage your shipping and billing addresses and edit your password "
				+ "and account details.", minhaConta.obterMensagemSucessoLogin());
		
	}
	
}
