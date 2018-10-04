package CatalogoNetflix;

public class CatalogoNetflixApp {

	public static void main(String[] args) throws Exception {
		Catalogo catalogo = new Catalogo(61);
		
		
		catalogo.inicializarCatalogo();
				
		catalogo.menu();
	}
}