package Questão_03;

public class Aplicacao {

	public static void main(String[] args) {
		ListaInicial listain = new ListaInicial();
		ListaSemRepeticoes listasr = new ListaSemRepeticoes();
		listain.inserirInicio(8);
		listain.inserirInicio(1);
		listain.inserirInicio(12);
		listain.inserirInicio(9);
		listain.inserirInicio(5);
		listain.inserirInicio(8);
		listain.inserirInicio(-7);
		listain.inserirInicio(5);
		listain.inserirInicio(12);
		System.out.println("Lista Inicial: ");
		listain.mostrar();
		//System.out.println("Lista sem repetições: ");
		//listasr.mostrar();
	}

}
