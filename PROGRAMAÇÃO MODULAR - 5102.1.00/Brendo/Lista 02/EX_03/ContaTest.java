package EX_03;

import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {
    private Conta conta;

    @Before
    public void setup(){
        conta = new Conta(174404, 7414, 30.00);
    }

    @Test
    public void testDeposita(){
        conta.depositar(50.00);
        assertEquals(80.00, conta.getSaldo());
    }

    @Test
    public void testDepositaNegativo(){
        conta.depositar(-30.00);
        assertEquals(30.00, conta.getSaldo());
    }

    @Test
    public void testSaque(){
        conta.sacar(20.00);
        assertEquals(10.00, conta.getSaldo());
    }

    @Test
    public void testSaqueNegativo(){
        conta.sacar(-20.00);
        assertEquals(30.00, conta.getSaldo());
    }
    @Test
    public void testSaqueTotal(){
        conta.sacar(30.00);
        assertEquals(0.00, conta.getSaldo());
    }
    @Test
    public void testSaqueMaiorQueSaldo(){
        conta.sacar(40.00);
        assertEquals(-10.00, conta.getSaldo());
    }

}
