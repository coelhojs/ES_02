package CatalogoNetflix;

import javax.swing.JOptionPane;

public class CatalogoNetflixApp {

	public static void main(String[] args) throws Exception {
		Catalogo catalogo = new Catalogo();

		catalogo.inicializarCatalogo();

catalogo.menu();
	}
}