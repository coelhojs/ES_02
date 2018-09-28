package CatalogoNetflix;

import javax.swing.JOptionPane;

public class CatalogoNetflixApp {

	public static void main(String[] args) throws Exception {
		Catalogo catalogo = new Catalogo();

		catalogo.inicializarCatalogo();

		Object[] options = { "Abrir o cat�logo", "Pesquisar s�rie", "Lista de favoritas", "Pedir uma sugest�o de s�rie",
				"Sair" };
		int opcao = JOptionPane.showOptionDialog(null, "Selecione a op��o abaixo", "Bem vindo ao Cat�logo Netflix",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		while (opcao != 4) {
			switch (opcao) {
			case 0:
				opcao = JOptionPane.showOptionDialog(null, catalogo.abrirCatalogo(), "Cat�logo de s�ries",
						JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
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
			default:
				break;
			}
		}
	}
}