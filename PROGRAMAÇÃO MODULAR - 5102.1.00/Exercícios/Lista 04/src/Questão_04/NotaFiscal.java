package Quest�o_04;

import java.time.LocalDate;

public interface NotaFiscal {
	public void emitirNF(LocalDate hoje);

	public LocalDate hoje = LocalDate.now();
}
