public class JatoDeTinta implements Impressora {
	public JatoDeTintaLegado impressora = new JatoDeTintaLegado();

	@Override
	public void imprimir(Documento d, int nrCopias, boolean duplicadas) {
		if (duplicadas)
			impressora.imprimir(d, nrCopias);
		else
			impressora.imprimirDuplicada(d, nrCopias);
	}
}