package Aulas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aula03Leitura {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int valor = Integer.parseInt(br.readLine());
		
		String nome = br.readLine();

		System.out.println("Valor lido " + valor);

		System.out.println("Nome lido " + nome);

		br.close();
	}

}
