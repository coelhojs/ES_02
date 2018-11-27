package Questao_01;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Joao");
		Funcionario func2 = new Funcionario("Claudio");
		Funcionario func3 = new Funcionario("Leonardo");
		Cliente clientePF1 = new ClientePF("Adriano", "123456789");
		Cliente clientePF2 = new ClientePF("Wesley", "123456789");
		Cliente clientePF3 = new ClientePF("Paulo", "123456789");
		Cliente clientePJ1 = new ClientePJ("Wesley", "123456789");
		Cliente clientePJ2 = new ClientePJ("Bruno", "123456789");
		Cliente clientePJ3 = new ClientePJ("Felipe", "123456789");

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(func1);
		funcionarios.add(func2);
		funcionarios.add(func3);
		for (Funcionario func : funcionarios) {
			System.out.println(func.getNome());
		}
		funcionarios.sort(func1, func2);

	}

}
