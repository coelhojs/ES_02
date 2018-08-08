public class Aula01 {

	// Fatorial
	static int fat(int n) {
		int resp;
		System.out.println("Entrou no fat:" + n);
		if (n == 1)
			resp = 1;
		else
			resp = n * fat(n - 1);
		System.out.println("Saiu do fat:" + n);
		return resp;
	}

	// Fibonacci
	static int fib(int n) {
		int resp;
		System.out.println("entrou no Fib:" + n);
		if (n == 0 || n == 1)
			resp = 1;
		else
			resp = fib(n - 1) + fib(n - 2);
		System.out.println("saiu do Fib:" + n);
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

	public static void main(String[] args) {
		// System.out.println("Valor do fator(5)" + fat(5));
		// System.out.println("Valor do fib(7)" + fib(7));
		// System.out.println("Exponencial de 2 na base 3: " + exp(2, 3));
		System.out.println("O binario de 10 e: " + dec(10));
	}
}
