package Questão_04_OK;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concessionaria implements NotaFiscal {
	static BufferedReader br;
	static int opcao;

	public void emitirNF() {

	}

	public static void main(String[] args) throws Exception {
		List<Item> lista = new ArrayList<Item>();
		double totalNF = 0;
		String nome, cor, tipo;
		double preco;
		long ano;
		LocalDate garantia;

		Carro carro1 = new Carro("Fiat Punto", 37.100, "Verde", 2013);
		Peca peca1 = new Peca("cambio", 400.00, "nova", hoje.plusDays(365));
		Servico servico1 = new Servico("Troca de óleo", 200.00);
		Carro carro2 = new Carro("Ford Ecosport", 19.940, "Preto", 2004);
		Peca peca2 = new Peca("Kit freio", 400.00, "usada", hoje.plusDays(90));
		Servico servico2 = new Servico("Balanceamento", 60.00);

		lista.add(carro1);
		lista.add(carro2);
		lista.add(peca1);
		lista.add(peca2);
		lista.add(servico1);
		lista.add(servico2);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("SISTEMA EMISSOR DE NOTA FISCAL\n1-Cadastrar itens\n2-Emitir Nota Fiscal\n0-SAIR");

		int opcao = Integer.parseInt(br.readLine());
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				System.out.println("Cadastro de Item");
				System.out.println("1-Veiculo\n2-Peca\n3-Servico\n4-SAIR");
				opcao = Integer.parseInt(br.readLine());
				switch (opcao) {
				case 1:
					System.out.println("Informe nome/modelo do item: ");
					nome = br.readLine();
					System.out.println("Informe o valor: ");
					preco = Double.parseDouble(br.readLine());
					System.out.println("Informe a cor: ");
					cor = br.readLine();
					System.out.println("Informe o ano: ");
					ano = Long.parseLong(br.readLine());
					Carro carro3 = new Carro(nome, preco, cor, ano);
					lista.add(carro3);
					break;
				case 2:
					System.out.println("Informe nome/modelo do item: ");
					nome = br.readLine();
					System.out.println("Informe o valor: ");
					preco = Double.parseDouble(br.readLine());
					System.out.println("Informe a tipo: ");
					tipo = br.readLine();
					System.out.println("Informe o prazo da garantia: (AAAA-MM-DD");
					garantia = LocalDate.parse(br.readLine());
					Peca peca3 = new Peca(nome, preco, tipo, garantia);
					lista.add(peca3);
					break;
				case 3:
					System.out.println("Informe nome/modelo do item: ");
					nome = br.readLine();
					System.out.println("Informe o valor: ");
					preco = Double.parseDouble(br.readLine());
					Servico serv3 = new Servico(nome, preco);
					lista.add(serv3);
					break;
				default:
					System.out.println("Opcao invalida!");
					break;
				}
				break;
			case 2:
				for (int i = 0; i < lista.size(); i++) {
					Item item = lista.get(i);
					System.out.println(item);
					totalNF += item.getPreco();
				}
				System.out.println("Valor total da Nota: " + totalNF);
				lista.clear();
				totalNF = 0;
				break;
			default:
				System.out.println("Opcao invalida");
				break;
			}
			System.out.println("SISTEMA EMISSOR DE NOTA FISCAL\n1-Cadastrar item\n2-Emitir Nota Fiscal\n0-SAIR");

			opcao = Integer.parseInt(br.readLine());

		}

		br.close();

	}

}
