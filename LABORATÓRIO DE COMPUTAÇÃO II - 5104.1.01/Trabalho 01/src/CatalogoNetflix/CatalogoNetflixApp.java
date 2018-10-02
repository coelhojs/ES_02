package CatalogoNetflix;

public class CatalogoNetflixApp {

	public static void main(String[] args) throws Exception {
		Catalogo_old catalogo_old = new Catalogo_old();
		
		
		catalogo_old.inicializarCatalogo();
				
		catalogo_old.menu();
	}
}