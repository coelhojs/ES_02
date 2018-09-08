package Questão_03;

public class EqRecorrencia {
	static int eqRecorrencia(int n) {
		int termo;
		if (n == 1) {
			return 2;
		} else if (n == 2) {
			return 3;
		} else {
			termo = 5 * n + (eqRecorrencia(n - 1));
			System.out.println("n: " + n);
			System.out.println("termo: " + termo);
			return termo;
		}
	}

	public static void main(String[] args) {
		System.out.println(eqRecorrencia(5));
		// O resultado correto para o termo 5 é: 1049.
	}
}
