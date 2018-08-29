package Questão_01;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class DataTest {
	Data data = new Data();

	@Before
	public void setup() throws Exception {
	}

	@Test
	void testAdicionaDias(int dias) {
		data.adicionaDias(3);
		assertEquals(1, data.getDia());
	}
}
