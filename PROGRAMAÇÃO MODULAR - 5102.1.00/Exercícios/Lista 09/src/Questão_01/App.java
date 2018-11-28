package Questão_01;

public class App {

	public static void main(String[] args) {

		Diretoria dir = new Diretoria();
		Superintendencia sup = new Superintendencia();
		Departamento dep = new Departamento();
		sup.setProx(dir);
		dep.setProx(sup);

		Setor aprovacao = dep;

		aprovacao.analisar(new Compra(10000));
	}
}
