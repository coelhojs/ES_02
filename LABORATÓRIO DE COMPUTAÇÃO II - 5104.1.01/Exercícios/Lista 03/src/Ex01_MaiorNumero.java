import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex01_MaiorNumero {

	public static int maiorNumero(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o primeiro numero: ");
		int n1 = Integer.parseInt(br.readLine());

		System.out.println("Digite o segundo numero: ");
		int n2 = Integer.parseInt(br.readLine());

		System.out.println("O maior numero é: " + maiorNumero(n1, n2));
	}

}
