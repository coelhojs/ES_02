package ArvoreBinaria;

public class ArvoresApp {

	/*
	 * public boolean compararArv (ArvoreBinaria a, ArvoreBinaria b) { boolean resp;
	 * String centralA = a.mostrarCentral();
	 * 
	 * return resp; }
	 */

	public static void main(String[] args) throws Exception {
		ArvoreBinaria arvBin = new ArvoreBinaria();
		ArvoreBinaria arvBin2 = new ArvoreBinaria();
		arvBin.inserir(15);
		arvBin.inserir(20);
		arvBin.inserir(7);
		arvBin.inserir(77);
		arvBin.inserir(13);
		arvBin.inserir(10);
		arvBin.inserir(14);

		arvBin2.inserir(15);
		arvBin2.inserir(20);
		arvBin2.inserir(7);
		arvBin2.inserir(77);
		arvBin2.inserir(13);
		arvBin2.inserir(10);

		System.out.println("Mostrar Pre:");
		arvBin.mostrarPre();
		System.out.println();
		System.out.println("Mostrar Central:");
		arvBin.mostrarCentral();
		System.out.println();
		System.out.println("Mostrar Pos");
		arvBin.mostrarPos();
		System.out.println();
		System.out.println("Folhas:" + arvBin.contarFolhas());
		// System.out.println("Comparando as 2 arvores: " +
		// arvBin.compararArv(arvBin2.raiz));

		// System.out.println("Nós:" + arvBin.contarNosPreenchidos());
		// System.out.println("Altura da arvore: " + arvBin.alturaArvore());
	}
}
