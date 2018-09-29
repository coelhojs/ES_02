package Quest�o_03;

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

	public String exibirPessoa() {
		StringBuilder valor = new StringBuilder();
		for (int i = 0; i < numPessoas; i++)
			valor.append("Cliente: " + clientes[i].getNome() + " Idade: " + clientes[i].getEndereco() + "\n");
		for (int i = 0; i < numPessoas; i++)
			valor.append(
					"Funcionario: " + funcionarios[i].getNome() + " Idade: " + funcionarios[i].getEndereco() + "\n");
		return valor.toString();
	}

}
