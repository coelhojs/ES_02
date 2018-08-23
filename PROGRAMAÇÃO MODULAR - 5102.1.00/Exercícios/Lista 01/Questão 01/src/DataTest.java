import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class DataTest {
	Data data = new Data(2018, 8, 20);

	@Before
	public void setup() throws Exception {
	}

	@Test
	void testAdicionaDias() {
		data.adicionaDias(3);
		assertEquals(23, data.getDia());
	}

	@Test
	void testAdicionaDiasMaior31() {
		data.adicionaDias(13);
		assertEquals(2, data.getDia());
		assertEquals(9, data.getMes());
	}

	@Test
	void testGetDiasNoMes() {
	}

}
