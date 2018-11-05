package Questão_03;

public class Aplication {
	public static void main(String[] args) throws Exception {
		Arvore a = new Arvore();

		a.inserir(32);
		a.inserir(76);
		a.inserir(24);
		a.inserir(48);
		a.inserir(19);

		a.mostrarCentral();
		a.mostrarPre();
		a.mostrarPos();

		System.out.println(a.numFolhas());
	}

}
