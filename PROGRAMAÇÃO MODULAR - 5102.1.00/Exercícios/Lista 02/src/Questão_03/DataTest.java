package Questão_03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class DataTest {
	Data data;
	
	@Before
	public void setup() throws Exception {
		data = new Data(2018, 8, 29);
	}

	@Test
	void testAdicionaDias() {
		data.adicionaDias(3);
		String novaData = data.getData().toString();
		assertEquals("2018-09-01", novaData);
	}

	@Test
	void testDiasNoMes() {
		int mesAtual = data.diasNoMes();
		assertEquals(31, mesAtual);
	}

	@Test
	void testDiaDaSemana() {
		String diaDaSemana = data.diaDaSemana();
		assertEquals("Quarta-feira", diaDaSemana);
	}

	@Test
	void testEAnoBissexto() {
		boolean eAnoBissexto = data.eAnoBissexto();
		assertEquals(false, eAnoBissexto);
	}

	@Test
	void testProximoDia() {
		data.proximoDia();
		int proximoDia = data.getDia();
		assertEquals(30, proximoDia);
	}
	
	@Test
	void testPorExtenso() {
		String porExtenso = data.porExtenso();
		assertEquals("29 de Agosto de 2018", porExtenso);
	}
}
