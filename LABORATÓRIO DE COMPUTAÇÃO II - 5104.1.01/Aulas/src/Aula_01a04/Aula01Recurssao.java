
public class Aula01Recurssao {

	static int fat(int n) {
		int resp;
		if (n == 1)
			resp = 1;
		else
			resp = n * fat(n - 1);
		return resp;
	}

	static int fib(int n) {
		int resp;
		if (n == 0 || n == 1)
			resp = 1;
		else
			resp = fib(n - 1) + fib(n - 2);
		return resp;
	}

	static int exp(int x, int y) {
		int resp;
		if (y == 0)
			resp = 1;
		else
			resp = x * exp(x, --y);
		return resp;
	}

	static String Dec2Bin(int num) {
		String resp = "";
		if (num / 2 > 0)
			resp += Dec2Bin(num / 2);
		resp += num % 2;
		return resp;
	}

	static int SeqT(int n) {
		int resp = 0;
		if (n == 0 || n == 1 || n == 2)
			resp = 1;
		else
			resp = SeqT(n - 1) + SeqT(n - 2) + SeqT(n - 3);
		return resp;
	}

	static boolean isVogal(char a) {
		boolean resp = false;
		if (a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u'
				|| a == 'U')
			resp = true;
		return resp;
	}

	static int contaConsoantes(String origem) {
		return contaConsoantes(origem, 0);
	}

	static int contaConsoantes(String origem, int i) {
		int resp;

		if (i == origem.length())
			resp = 0;
		else if (!isVogal(origem.charAt(i)))
			resp = 1 + contaConsoantes(origem, i + 1);
		else
			resp = contaConsoantes(origem, i + 1);
		return resp;
	}

	static int multiplosCinco(int n) {
		int resp = 0;

		if (n == 0)
			resp = 0;
		else
			resp = 5 + multiplosCinco(n - 1);
		
		System.out.println("5 * " + n + " = " + resp);
		return resp;
	}

	public static void main(String[] args) {
		// System.out.println("Valor do Fat(5) " + fat(5));
		// System.out.println("Valor do Fib(7) " + fib(7));
		// System.out.println("Valor de 2^5 = " + exp(2,5));
		// System.out.println(Dec2Bin(15));
		multiplosCinco(10);
	}

}
