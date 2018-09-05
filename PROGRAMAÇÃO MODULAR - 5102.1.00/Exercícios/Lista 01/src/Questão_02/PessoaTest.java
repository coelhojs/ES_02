package Questão_02;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PessoaTest {

	Pessoa pessoa;

	@BeforeEach
	void setUp() throws Exception {
		pessoa = new Pessoa("Cristiano", 11254085610L, 24, "masculino");
	}

	@Test
	void testMaiorIdade() {
		pessoa.getIdade();
		// Sempre que for realizae mais de um caso de teste, colocar mensagens de erro
		assertTrue("Testando maior idade", pessoa.isMaiorIdade());
	}

}
