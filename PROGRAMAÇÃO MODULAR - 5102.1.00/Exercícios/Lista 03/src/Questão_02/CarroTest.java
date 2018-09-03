package Questão_02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CarroTest {

	private Carro carro;

	@Before
	public void setup() throws Exception {
		carro = new Carro(160, 15000.00, "chumbo");
	}

	@Test
	void testGetPrecoVenda() {
		double precoVenda = carro.getPrecoVenda();
		assertEquals(precoVenda > 0, carro.getPrecoVenda());
	}

}
