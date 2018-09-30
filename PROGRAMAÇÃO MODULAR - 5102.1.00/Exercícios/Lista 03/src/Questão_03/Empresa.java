package Questão_03;

public class Empresa {

	private static final int MAX_LISTA = 100;
	private Cliente[] clientes = new Cliente[MAX_LISTA];
	public Funcionario[] funcionarios = new Funcionario[MAX_LISTA];
	private int numPessoas = 0;

	public void adicionarCliente(Cliente cliente) {
		if (numPessoas < MAX_LISTA) {
			clientes[numPessoas] = cliente;
			numPessoas++;
		}

	}

	public void adicionarFuncionario(Funcionario funcionario) {
		if (numPessoas < MAX_LISTA) {
			funcionarios[numPessoas++] = funcionario;
		}
	}

	public String exibirPessoas() {
		StringBuilder valor = new StringBuilder();
		if (clientes[0] != null) {
			for (int i = 0; i < numPessoas; i++)
				valor.append("Cliente: " + clientes[i].getNome() + " CPF: " + clientes[i].getCpf() + " Endereço: "
						+ clientes[i].getEndereco() + " Telefone: " + clientes[i].getTelefone() + " Idade: "
						+ clientes[i].getIdade() + " Sexo: " + clientes[i].getSexo() + " Limite de crédito: "
						+ clientes[i].getLimiteCredito() + "\n");
		}
		if (funcionarios[0] != null) {
			for (int i = 0; i < numPessoas; i++)
				valor.append("Funcionario: " + funcionarios[i].getNome() + " Idade: " + funcionarios[i].getEndereco()
						+ "\n");
		}
		return valor.toString();
	}

}
