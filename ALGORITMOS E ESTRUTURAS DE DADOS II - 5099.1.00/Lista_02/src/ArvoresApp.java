public class ArvoresApp {

	public static void main(String[] args) throws Exception {
		ArvoreBinaria arvBin = new ArvoreBinaria();
		ArvoreBinaria arvBin2 = new ArvoreBinaria();
		arvBin.inserir(15);
		arvBin.inserir(20);
		arvBin.inserir(7);
		arvBin.inserir(77);
		arvBin.inserir(13);
		arvBin.inserir(10);

		arvBin2.inserir(15);
		arvBin2.inserir(20);
		arvBin2.inserir(7);
		arvBin2.inserir(77);
		arvBin2.inserir(13);
		arvBin2.inserir(10);

		System.out.println("Mostrar Central:");
		arvBin.mostrarCentral();
		System.out.println();
		System.out.println("Folhas:" + arvBin.contarFolhas());
		System.out.println("Comparando as 2 arvores: " + arvBin.compararArv(arvBin2));
		
		
		// System.out.println("Nós:" + arvBin.contarNosPreenchidos());
		// System.out.println("Altura da arvore: " + arvBin.alturaArvore());
	}
}
