public class Aula01 {

	// 1.Fazer um método recursivo que recebe um número inteiro e retorna o seu
	// fatorial.
	static int fat(int n) {
		int resp;

		if (n == 1 || n == 0)
			resp = 1;
		else
			resp = n * fat(n - 1);

		return resp;
	}

	// 2.Fazer um método recursivo que recebe um número inteiro n e retorna o
	// n-ésimo termo da sequência de Fibonacci.
	static int fib(int n) {
		int resp;

		if (n == 0 || n == 1)
			resp = 1;
		else
			resp = fib(n - 1) + fib(n - 2);
		return resp;
	}

	// Exponencial
	static int exp(int x, int y) {
		int resp;
		if (y == 0)
			resp = 1;
		else
			resp = x * (exp(x, y - 1));
		return resp;
	}

	// Conversor de decimal para binário
	static String dec(int num) {
		String resp = "";
		if (num / 2 > 0)
			resp += dec(num / 2);
		resp += num % 2;
		return resp;
	}

	// 4.Fazer um método recursivo que recebe um número inteiro n e
	// retorna o n-ésimo termo da equaçãode recorrência abaixo:
	// T(0) = 1
	// T(1) = 1
	// T(2) = 1
	// T(n) = T(n−1)+T(n−2)+T(n−3)
	static int enesimo(int termos) {
		int resp;

		if (termos >= 0 && termos <= 2) {
			resp = 1;
		} else
			resp = enesimo(termos - 1) + enesimo(termos - 2) + enesimo(termos - 3);
		return resp;
	}

	// 5.Fazer um método recursivo que recebe um número inteiro e positivo n
	// e calcula o somatório abaixo:
	// n + (n−1) + ... + 1 + 0

	static int somatorio(int n) {
		if (n > 0) {
			return n + somatorio(n - 1);
		} else {
			return 0;
		}
	}

	// 6.Fazer um método recursivo que receba um número inteiro n e imprima os n
	// primeiros múltiplos de 5.
	static void multiplosDe5(int n) {
		if (n > 0) {
			multiplosDe5(n - 1);
			System.out.println(5 * (n - 1));
		}

		/*
		 * outro raciocinio - tentar int x = 0;
		 * 
		 * if (n < x) { return multiplosDe5(5 * (x + 1)); } else if (x == n) {
		 * return 0; }
		 */
	}

	public static void main(String[] args) {
		// 1
		// System.out.println("Valor do fatorial de 5: " + fat(5));
		// 2
		// System.out.println("Valor do fib(7)" + fib(7));
		// 3
		// System.out.println("Exponencial de 2 na base 3: " + exp(2, 3));
		// 4
		// System.out.println("n: 5. n-esimo: " + enesimo(5));
		// 5
		// System.out.println("Somatorio de 9: " + somatorio(9));
		// 6
		//multiplosDe5(10);
	}
}
