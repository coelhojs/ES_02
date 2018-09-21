package CatalogoNetflix;

import javax.swing.JOptionPane;

public class CatalogoNetflixApp {

	public static void main(String[] args) {
		Object[] options = { "Abrir o catálogo", "Pesquisar série", "Lista de favoritas",
				"Pedir uma sugestão de série" };
		JOptionPane.showOptionDialog(null, "Selecione a opção abaixo", "Bem vindo ao Catálogo Netflix",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	}

}
