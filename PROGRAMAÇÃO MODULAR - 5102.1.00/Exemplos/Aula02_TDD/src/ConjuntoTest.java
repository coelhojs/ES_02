import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ConjuntoTest {

	@Test
	void testConjuntoVazio() {
		Conjunto c = new Conjunto();
		Assert.assertEquals(0, c.tamanho());
	}

}
