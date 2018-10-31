package Questão_04_OK;

import java.time.LocalDate;

public interface NotaFiscal {
	public void emitirNF();

	public LocalDate hoje = LocalDate.now();
}
