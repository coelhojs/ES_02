package Questao_05;

import javax.swing.JOptionPane;

public class Aplicação {

	public static void adicionarPessoa(Empresa pessoa) {
		PessoaFisica pf;
		PessoaJuridica pj;
		Cliente cliente;
		Funcionario funcionario;

		String nome, endereco, sexo, cargo, cidade, uf;
		int telefone, idade, cep;
		double limiteCredito, salario;
		long cpf, cnpj;

		Object[] opcoes = { "Cliente PF", "Cliente PJ", "Funcionario" };
		int opcao = JOptionPane.showOptionDialog(null, "Que tipo de pessoa deseja adicionar?", "Empresa X",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		switch (opcao) {
		case 0:
			// Cliente cliente = new Cliente(pj, limiteCredito);
			pf = new PessoaFisica("Nome do cliente", "endereço", 985877928, 11254085610L, 24, "masculino");
			cliente = new Cliente(pf, 500);
			pessoa.adicionarCliente(cliente);

			nome = JOptionPane.showInputDialog(null, "Informe o nome:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			endereco = JOptionPane.showInputDialog(null, "Informe o endereço:", "Cadastro",
					JOptionPane.OK_CANCEL_OPTION);
			telefone = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe o telefone:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			cpf = Long.parseLong(
					JOptionPane.showInputDialog(null, "Informe o CPF:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			idade = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe a idade:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			sexo = JOptionPane.showInputDialog(null, "Informe o sexo:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			limiteCredito = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o limite de crédito:",
					"Cadastro", JOptionPane.OK_CANCEL_OPTION));
			pf = new PessoaFisica(nome, endereco, telefone, cpf, idade, sexo);
			pessoa.adicionarCliente(new Cliente(pf, limiteCredito));

			break;
		case 1:
			nome = JOptionPane.showInputDialog(null, "Informe o nome:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			endereco = JOptionPane.showInputDialog(null, "Informe o endereço:", "Cadastro",
					JOptionPane.OK_CANCEL_OPTION);
			cidade = JOptionPane.showInputDialog(null, "Informe a cidade:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			uf = JOptionPane.showInputDialog(null, "Informe o Estado:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			cep = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe o CEP:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			telefone = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe o telefone:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			cnpj = Long.parseLong(
					JOptionPane.showInputDialog(null, "Informe o CNPJ:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			limiteCredito = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o limite de crédito:",
					"Cadastro", JOptionPane.OK_CANCEL_OPTION));
			pj = new PessoaJuridica(nome, endereco, cidade, uf, telefone, cep, cnpj);
			pessoa.adicionarCliente(new Cliente(pj, limiteCredito));
			pj = new PessoaJuridica(nome, endereco, cidade, uf, telefone, cep, cnpj);
			cliente = new Cliente(pj, limiteCredito);
			pessoa.adicionarCliente(cliente);
			break;
		case 2:
			nome = JOptionPane.showInputDialog(null, "Informe o nome:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			endereco = JOptionPane.showInputDialog(null, "Informe o endereço:", "Cadastro",
					JOptionPane.OK_CANCEL_OPTION);
			telefone = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe o telefone:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			cpf = Long.parseLong(
					JOptionPane.showInputDialog(null, "Informe o CPF:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			idade = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe a idade:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			sexo = JOptionPane.showInputDialog(null, "Informe o sexo:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			cargo = JOptionPane.showInputDialog(null, "Informe o cargo:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			salario = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Informe o salario:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			pf = new PessoaFisica(nome, endereco, telefone, cpf, idade, sexo);
			funcionario = new Funcionario(pf, cargo, salario);
			pessoa.adicionarFuncionario(funcionario);
			break;
		}
	}

	public static void main(String[] args) {
		Empresa pessoa = new Empresa();

		Object[] options = { "Cadastrar uma Pessoa", "Exibir Clientes", "Exibir Funcionários", "Sair" };
		int opcao = JOptionPane.showOptionDialog(null, "Selecione a opção abaixo", "Bem vindo ao Catálogo Netflix",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		while (opcao != 4) {
			switch (opcao) {
			case 1:
				adicionarPessoa(pessoa);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, pessoa.exibirClientes(), "Clientes cadastrados",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, pessoa.exibirFuncionarios(), "Funcionarios cadastrados",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}

	}
}
