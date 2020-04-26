package br.sc.rafael.pages;

import org.openqa.selenium.By;

import br.sc.rafael.core.BasePage;

public class ProdutoPages extends BasePage {

	public void escolherProduto() {
		clicarBotao(By.xpath("//*[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']"));
	}

	public String obterAlteracaoCarrinho() {
		return obterTexto(By.xpath("//*[@class='cartcontents']"));
	}
	
	public void acessarCarrinho() {
		clicarBotao(By.xpath("//span[@class='cartcontents']"));;
	}

	public String verificarProdutoComprado(String conta) {
		return obterCelula("Product", conta, "Total", "//*[@class='shop_table shop_table_responsive cart']").getText();

	}

}
