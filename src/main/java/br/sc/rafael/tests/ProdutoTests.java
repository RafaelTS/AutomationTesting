package br.sc.rafael.tests;

import br.sc.rafael.core.BaseTest;
import br.sc.rafael.pages.MenuPage;
import br.sc.rafael.pages.ProdutoPages;
import org.junit.Assert;
import org.junit.Test;




public class ProdutoTests extends BaseTest {

	ProdutoPages produtoPage = new ProdutoPages();
	MenuPage menuPage = new MenuPage();

	@Test
	public void comprarProdutoEVerificar() throws InterruptedException {

		menuPage.acessarPracticeSite();
		menuPage.acessarShop();
		menuPage.escolherSelenium();
		produtoPage.escolherProduto();

		// sem a espera ele não consegue ler o elemento, a busca é mais rápida que a
		// alteração do elemento, encontrando 0 ao invés de 1.
		Thread.sleep(1000);

		Assert.assertEquals("1 Item", produtoPage.obterAlteracaoCarrinho());
		produtoPage.acessarCarrinho();
		Assert.assertEquals("₹500.00", produtoPage.verificarProdutoComprado("Selenium Ruby"));

	}

}
