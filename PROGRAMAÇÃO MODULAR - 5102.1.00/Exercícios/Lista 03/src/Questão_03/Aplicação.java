package Quest�o_03;

import javax.swing.JOptionPane;

public class Aplica��o {

	public static void adicionarPessoa(Empresa pessoa) {
		PessoaFisica pf;
		PessoaJuridica pj;

		String nome, endereco, sexo, cargo;
		int telefone, idade;
		double limiteCredito, salario;
		long cpf, cnpj;

		Object[] opcoes = { "Cliente PF", "Cliente PJ", "Funcionario" };
		int opcao = JOptionPane.showOptionDialog(null, "Que tipo de pessoa deseja adicionar?", "Empresa X",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		switch (opcao) {
		case 0:
			nome = JOptionPane.showInputDialog(null, "Informe o nome:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			endereco = JOptionPane.showInputDialog(null, "Informe o endere�o:", "Cadastro",
					JOptionPane.OK_CANCEL_OPTION);
			telefone = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe o telefone:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			cpf = Long.parseLong(
					JOptionPane.showInputDialog(null, "Informe o CPF:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			idade = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe a idade:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			sexo = JOptionPane.showInputDialog(null, "Informe o sexo:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			limiteCredito = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o limite de cr�dito:",
					"Cadastro", JOptionPane.OK_CANCEL_OPTION));
			pf = new PessoaFisica(nome, endereco, telefone, cpf, idade, sexo);
			pessoa.adicionarCliente(new Cliente(pf, limiteCredito));
			break;
		case 1:
			nome = JOptionPane.showInputDialog(null, "Informe o nome:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			endereco = JOptionPane.showInputDialog(null, "Informe o endere�o:", "Cadastro",
					JOptionPane.OK_CANCEL_OPTION);
			telefone = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe o telefone:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			cnpj = Long.parseLong(
					JOptionPane.showInputDialog(null, "Informe o CNPJ:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			limiteCredito = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o limite de cr�dito:",
					"Cadastro", JOptionPane.OK_CANCEL_OPTION));
			pj = new PessoaJuridica(nome, endereco, telefone, cnpj);
			pessoa.adicionarCliente(new Cliente(pj, limiteCredito));
			break;
		case 2:
			nome = JOptionPane.showInputDialog(null, "Informe o nome:", "Cadastro", JOptionPane.OK_CANCEL_OPTION);
			endereco = JOptionPane.showInputDialog(null, "Informe o endere�o:", "Cadastro",
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
			pessoa.adicionarFuncionario(new Funcionario(pf, cargo, salario));
			break;
		}
	}

	public static void main(String[] args) {
		Empresa pessoa = new Empresa();
		/*
		 * Object[] options = { "", "Pesquisar s�rie", "Lista de favoritas",
		 * "Pedir uma sugest�o de s�rie", "Sair" }; int opcao =
		 * JOptionPane.showOptionDialog(null, "Selecione a op��o abaixo",
		 * "Bem vindo ao Cat�logo Netflix", JOptionPane.DEFAULT_OPTION,
		 * JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); while (opcao !=
		 * 4) { switch (opcao) { } }
		 */
		adicionarPessoa(pessoa);
		pessoa.exibirPessoa();
	}
}
