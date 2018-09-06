package Questão_01;
public class Fatorial {
	public static int fatorial(int n) {
		int fat;

		if (n == 1 || n == 0) {
			fat = 1;
			return fat;
		} else {
			fat = n * (fatorial(n - 1));
			return fat;
		}
	}

	public static void main(String[] args) {
		System.out.println("O fatorial de 6 é: " + fatorial(6));
	}
}