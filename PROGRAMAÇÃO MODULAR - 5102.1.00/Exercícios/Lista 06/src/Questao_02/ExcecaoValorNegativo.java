package Questao_02;

@SuppressWarnings("serial")
public class ExcecaoValorNegativo extends Exception {
	public ExcecaoValorNegativo() {
		super("Valores financeiros nao devem ser negativos.");
	}

}
