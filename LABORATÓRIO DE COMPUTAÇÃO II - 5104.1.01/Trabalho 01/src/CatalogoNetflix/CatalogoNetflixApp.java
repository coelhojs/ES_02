package CatalogoNetflix;

import javax.swing.JOptionPane;

public class CatalogoNetflixApp {

	public static void main(String[] args) {
		Object[] options = { "Abrir o cat�logo", "Pesquisar s�rie", "Lista de favoritas",
				"Pedir uma sugest�o de s�rie" };
		JOptionPane.showOptionDialog(null, "Selecione a op��o abaixo", "Bem vindo ao Cat�logo Netflix",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	}

}
