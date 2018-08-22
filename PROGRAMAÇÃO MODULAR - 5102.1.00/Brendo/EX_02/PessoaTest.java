package EX_02;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    Pessoa pessoa;

    @Test
    public void testMaiorIdade() {
        pessoa = new Pessoa("Brendo", "13195058642", 18, "Masculino");
        assertTrue(pessoa.isMaiorIdade());
    }

    @Test
    public void testMaiorIdadeFalha() {
        pessoa = new Pessoa("Brendo", "13195058642", 17, "Masculino");
        assertFalse(pessoa.isMaiorIdade());
    }

    @Test
    public void testMaiorIdadeNegativo() {
        pessoa = new Pessoa("Brendo", "13195058642", -1, "Masculino");
        assertFalse(pessoa.isMaiorIdade());
    }
}
