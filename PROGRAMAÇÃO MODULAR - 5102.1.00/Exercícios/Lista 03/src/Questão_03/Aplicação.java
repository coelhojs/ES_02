package Questão_03;

import javax.swing.JOptionPane;

public class Aplicação {

	public static void adicionarPessoa(Empresa pessoa) {

		String nome, endereco, sexo;
		int telefone, idade;
		long cpf, cnpj;

		Object[] opcoes = { "Cliente PF", "Cliente PJ", "Funcionario" };
		int opcao = JOptionPane.showOptionDialog(null, "Que tipo de pessoa deseja adicionar?", "Empresa X",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		switch (opcao) {
		case 0:
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

			pessoa.adicionarCliente(new PessoaFisica(nome, endereco, telefone, cpf, idade, sexo));
			break;
		case 1:
			nome = JOptionPane.showInputDialog(null, "Informe o nome:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			endereco = JOptionPane.showInputDialog(null, "Informe o endereço:", "Cadastro",
					JOptionPane.OK_CANCEL_OPTION);
			telefone = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe o telefone:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			cnpj = Long.parseLong(
					JOptionPane.showInputDialog(null, "Informe o CNPJ:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));

			pessoa.adicionarCliente(new PessoaJuridica(nome, endereco, telefone, cnpj));
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

			pessoa.adicionarCliente(new PessoaFisica(nome, endereco, telefone, cpf, idade, sexo));
			break;
		}
	}

	public static void main(String[] args) {
		Empresa pessoa = new Empresa();

		adicionarPessoa(pessoa);
	}
}
