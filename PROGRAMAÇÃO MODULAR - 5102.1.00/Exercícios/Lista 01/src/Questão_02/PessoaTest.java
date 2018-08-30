package Questão_02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PessoaTest {
	Pessoa pessoa = new Pessoa("Cristiano", 11254085610L, 24, "masculino");

	@Test
	void testMaiorIdade() {
		pessoa.getIdade();
		assertTrue(pessoa.isMaiorIdade());
	}

}
