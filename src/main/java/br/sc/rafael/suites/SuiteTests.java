package br.sc.rafael.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.sc.rafael.tests.DemoClassTest;
import br.sc.rafael.tests.MinhaContaTests;
import br.sc.rafael.tests.MudarParaTests;
import br.sc.rafael.tests.ProdutoTests;

@RunWith(Suite.class)
@SuiteClasses({
	DemoClassTest.class,
	ProdutoTests.class,
	MudarParaTests.class,
	MinhaContaTests.class
	
})

public class SuiteTests {

}
