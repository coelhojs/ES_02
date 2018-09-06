package EX_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    public void testAdicionaDias() {
        Data date = new Data(2018, 6, 12);
        date.adicionaDias(3);
        assertEquals(15, date.getDia());
    }

    @Test
    public void testAdicionaDias0() {
        Data date = new Data(2018, 6, 12);
        date.adicionaDias(0);
        assertEquals(12, date.getDia());
    }

    @Test
    public void testAdicionaMuitosDias() {
        Data date = new Data(2018, 6, 12);
        date.adicionaDias(30);
        assertEquals(07, date.getMes());
        assertEquals(11, date.getDia());
    }

    @Test
    public void testAdicionaDiasPassaAno() {
        Data date = new Data(2018, 12, 30);
        date.adicionaDias(2);
        assertEquals(01, date.getMes());
        assertEquals(01, date.getDia());
        assertEquals(2019, date.getAno());
    }


    @Test
    public void testDiasNoMes() {
        Data date = new Data(2018, 6, 12);
        assertEquals(30, date.diasNoMes());

    }

    @Test
    public void testDiaDaSemana() {
        Data date = new Data(2019, 8, 04);
        assertEquals("Domingo", date.diaDaSemana());
    }

    @Test
    public void testDiaDaSemanaMaiorQueUltimo() {
        Data date = new Data(2019, 9, 32);
        assertEquals("Quarta-feira", date.diaDaSemana());
    }

    @Test
    public void testeEAnoBisexto() {
        Data date = new Data(1988, 8, 20);
        assertTrue(date.eAnoBisexto());
    }
    @Test
    public void testeNaoEAnoBisexto() {
        Data date = new Data(2018, 8, 20);
        assertFalse(date.eAnoBisexto());
    }
    @Test
    public void testeProximoDia() {
        Data date = new Data(2018, 8, 20);
        date.proximoDia();
        assertEquals(21, date.getDia());
    }
    @Test
    public void testeProximoDiaLimite() {
        Data date = new Data(2018, 8, 31);
        date.proximoDia();
        assertEquals(1, date.getDia());
    }
}

