package Questão_02;

public class NumeroDecrescente {

	public static int numeroDecrescente(int num) {
		if (num > 0) {
			return numeroDecrescente(num - 1);
		} else {
			return 0;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Numeros: ");
		System.out.println(numeroDecrescente(10));
	}

}
