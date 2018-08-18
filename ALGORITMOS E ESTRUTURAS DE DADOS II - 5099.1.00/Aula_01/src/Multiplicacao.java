public class Multiplicacao {

	public static void main(String[] args) {
		System.out.println("A soma das multiplicacoes é: " + multiplicacao(4, 3));
	}

	public static int multiplicacao(int num1, int num2) {

		if (num2 > 0) {
			return num1 + multiplicacao(num1, num2 - 1);
		} else {
			return 0;
		}
	}
}