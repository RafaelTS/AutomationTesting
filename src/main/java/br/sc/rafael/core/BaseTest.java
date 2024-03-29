package br.sc.rafael.core;

import static br.sc.rafael.core.DriverFactory.getDriver;
import static br.sc.rafael.core.DriverFactory.killDriver;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.sc.rafael.pages.AcessoSite;

public class BaseTest {

	AcessoSite acessoSite = new AcessoSite();

	@Rule
	public TestName testName = new TestName();

	@Before
	public void inicializaPagina() {
		acessoSite.acessarTelaPrincipal();

	}

	@After
	public void finaliza() throws IOException {
		try {
			TakesScreenshot ss = (TakesScreenshot) getDriver();
			File arquivo = ss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(arquivo, new File(
					"target" + File.separator + "screenshot" + File.separator + testName.getMethodName() + ".jpg"));
		} finally {

			if (Propriedades.FECHAR_BROWSER) {
				killDriver();
			}
		}
	}
}
