package br.sc.rafael.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.sc.rafael.core.BasePage;
import br.sc.rafael.core.BaseTest;
import br.sc.rafael.pages.MenuPage;
import br.sc.rafael.pages.MudarParaPages;

public class MudarParaTests extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	MudarParaPages mudarPara = new MudarParaPages();
	
	BasePage basePage = new BasePage();
	
	@Test
	public void testeSimplesAlert() {
		menuPage.acessarMudarPara();
		menuPage.acessarAlerts();
		
		mudarPara.clicarBotaoAlertSimples();
		String texto = basePage.alertaObterTexto();
		assertEquals("I am an alert box!", texto);
		
	}

}
