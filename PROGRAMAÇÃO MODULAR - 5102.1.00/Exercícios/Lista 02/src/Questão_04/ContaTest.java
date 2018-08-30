package Questão_04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContaTest {

	Conta conta = new Conta("Cristiano", 2321, 90, 20);

	@Test
	public void testDepositar() {
		conta.depositar(10);
		assertEquals(30, conta.getSaldo());
	}

	@Test
	public void testSacar() {
		conta.sacar(10);
		assertEquals(10, conta.getSaldo());
	}
}
