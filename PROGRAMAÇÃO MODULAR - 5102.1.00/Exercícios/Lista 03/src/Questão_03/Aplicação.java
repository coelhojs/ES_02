package Questão_03;

import javax.swing.JOptionPane;

public class Aplicação {

	public static void adicionarPessoa(Empresa pessoa) {
		Object[] opcoes = { "Cliente PF", "Cliente PJ", "Funcionario" };
		int opcao = JOptionPane.showOptionDialog(null, "Que tipo de pessoa deseja adicionar?", "Empresa X",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		switch (opcao) {
		case 0:
			String nome = JOptionPane.showInputDialog(null, "Informe o nome:", "Cadastro",
					JOptionPane.OK_CANCEL_OPTION);
			String endereco = JOptionPane.showInputDialog(null, "Informe o endereço:", "Cadastro",
					JOptionPane.OK_CANCEL_OPTION);
			int telefone = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe o telefone:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			long cpf = Long.parseLong(
					JOptionPane.showInputDialog(null, "Informe o CPF:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			int idade = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Informe a idade:", "Cadastro", JOptionPane.OK_CANCEL_OPTION));
			String sexo = JOptionPane.showInputDialog(null, "Informe o sexo:", "Cadastro",
					JOptionPane.OK_CANCEL_OPTION);

			pessoa.adicionarCliente(new PessoaFisica(nome, endereco, telefone, cpf, idade, sexo));
			break;
		case 1:
			pessoa.adicionarCliente(new PessoaJuridica());
			break;
		case 2:
			pessoa.adicionarFuncionario(new PessoaFisica());
			break;
		}
	}

	public static void main(String[] args) {
		Empresa pessoa = new Empresa();

		adicionarPessoa(pessoa);
	}
}
