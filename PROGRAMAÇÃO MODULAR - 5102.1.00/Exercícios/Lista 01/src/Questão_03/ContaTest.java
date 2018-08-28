package Questão_03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContaTest {

	@Test
	public void testDepositar() {
		Conta conta = new Conta("Cristiano", 2321, 20);
		conta.depositar(10);
		assertEquals(30, conta.getSaldo());
	}

	@Test
	public void testSacar() {
		Conta conta = new Conta("Cristiano", 2321, 20);
		conta.sacar(10);
		assertEquals(10, conta.getSaldo());
	}
}
