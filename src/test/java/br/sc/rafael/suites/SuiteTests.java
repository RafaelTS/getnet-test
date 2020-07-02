package br.sc.rafael.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.sc.rafael.tests.BuscaTest;

@RunWith(Suite.class)
@SuiteClasses({
	BuscaTest.class
		
})

public class SuiteTests {

}
