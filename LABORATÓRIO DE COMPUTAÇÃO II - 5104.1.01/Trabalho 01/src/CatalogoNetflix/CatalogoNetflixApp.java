package CatalogoNetflix;

import javax.swing.JOptionPane;

public class CatalogoNetflixApp {

	public static void main(String[] args) throws Exception {
		Catalogo catalogo = new Catalogo();
		
		catalogo.inicializarCatalogo();
		
		Object[] options = { "Abrir o cat�logo", "Pesquisar s�rie", "Lista de favoritas",
				"Pedir uma sugest�o de s�rie" };
		int opcao = JOptionPane.showOptionDialog(null, "Selecione a op��o abaixo", "Bem vindo ao Cat�logo Netflix",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		switch (opcao) {
		case 0:
			catalogo.abrirCatalogo();
			break;
		case 1:
			catalogo.pesquisarSerie();
			break;
		case 2:
			catalogo.listaFavoritos();
			break;
		case 3:
			catalogo.sugestaoSerie();
			break;
		}
	}
}