import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PessoaTest {
	Pessoa pessoa = new Pessoa("Cristiano", 11254085610L, 24, "masculino");

	@Test
	void testCpfTypeLong() {
		pessoa.getCpf();
		assertTrue(pessoa.cpfTypeLong());
	}

	@Test
	void testMaiorIdade() {
		pessoa.setIdade(18);
		assertTrue(pessoa.isMaiorIdade());
	}

}
