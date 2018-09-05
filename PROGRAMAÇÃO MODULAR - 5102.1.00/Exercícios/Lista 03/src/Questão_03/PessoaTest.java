package Questão_03;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PessoaTest {
	Pessoa pessoa;

	@BeforeEach
	void setUp() throws Exception {
		pessoa = new Pessoa("Cristiano");
	}

	@Test
	void testMaiorIdade() {
		pessoa.getIdade();
		assertTrue(pessoa.isMaiorIdade());
	}

}
