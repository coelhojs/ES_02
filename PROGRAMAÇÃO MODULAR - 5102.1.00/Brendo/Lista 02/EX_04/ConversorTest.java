package EX_04;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConversorTest {
    private Conversor conversor;

    public ConversorTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void converterPesParaMetros() {
        conversor = new Conversor();
        assertEquals(1.524, conversor.converterPesParaMetros(5));
    }

    @Test
    public void converterPesParaPolegadas() {
        conversor = new Conversor();
        assertEquals(36000.0, conversor.converterPesParaPolegadas(3));
    }

    @Test
    public void converterPesParaCentimetros() {
        conversor = new Conversor();
        assertEquals(0.22965599999999997, conversor.converterPesParaCentimetros(7));
    }

    @Test
    public void converterPolegadasParaMetros() {
        conversor = new Conversor();
        assertEquals(0.17779999999999999, conversor.converterPolegadasParaMetros(7));
    }

    @Test
    public void converterPolegadasParaPes() {
        conversor = new Conversor();
        assertEquals(0.583331, conversor.converterPolegadasParaPes(7));
    }

    @Test
    public void converterPolegadasParaCentimetros() {
        conversor = new Conversor();
        assertEquals(17.78003556007112, conversor.converterPolegadasParaCentimetros(7));
    }

    @Test
    public void converterMetrosParaPes() {
        conversor = new Conversor();
        assertEquals(39.369600000000005, conversor.converterMetrosParaPes(12));
    }

    @Test
    public void converterMetrosParaPolegadas() {
        conversor = new Conversor();
        assertEquals(236.21999999999997, conversor.converterMetrosParaPolegadas(6));
    }

    @Test
    public void converterMetrosParaCentimetros() {
        conversor = new Conversor();
        assertEquals(600.0, conversor.converterMetrosParaCentimetros(6));
    }

    @Test
    public void converterCentimetrosParaPes() {
        conversor = new Conversor();
        assertEquals(0.295272, conversor.converterCentimetrosParaPes(9));
    }

    @Test
    public void converterCentimetrosParaPolegadas() {
        conversor = new Conversor();
        assertEquals(7.874, conversor.converterCentimetrosParaPolegadas(20));
    }

    @Test
    public void converterCentimetrosParaMetros() {
        conversor = new Conversor();
        assertEquals(0.2, conversor.converterCentimetrosParaMetros(20));
    }

}
