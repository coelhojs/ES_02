package Questão_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PessoaTest {
	Pessoa pessoa;

	@BeforeEach
	void setUp() throws Exception {
		pessoa = new Pessoa();
	}

	@Test
	void testNomePadrao() {
		assertEquals("Nome Padrão", pessoa.getNome());
	}

}
