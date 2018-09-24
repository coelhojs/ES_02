package CatalogoNetflix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class CatalogoNetflixApp {

	public static void main(String[] args) throws Exception {
		Catalogo catalogo = new Catalogo();
		
		Object[] options = { "Abrir o cat�logo", "Pesquisar s�rie", "Lista de favoritas",
				"Pedir uma sugest�o de s�rie" };
		int opcao = JOptionPane.showOptionDialog(null, "Selecione a op��o abaixo", "Bem vindo ao Cat�logo Netflix",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		switch (opcao) {
		case 0:
			catalogo.abrirCatalogo();
			break;

		}
	}
}