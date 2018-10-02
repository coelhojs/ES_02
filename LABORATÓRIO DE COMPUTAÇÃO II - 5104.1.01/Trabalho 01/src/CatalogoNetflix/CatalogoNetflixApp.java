package CatalogoNetflix;

public class CatalogoNetflixApp {

	public static void main(String[] args) throws Exception {
		Catalogo catalogo = new Catalogo();
		
		
		catalogo.inicializarCatalogo();
				
		catalogo.menu();
	}
}