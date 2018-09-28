package Questão_03;

public class Empresa {

	private static final int MAX_LISTA = 100;
	private Pessoa[] clientes;
	public Pessoa[] funcionarios;
	private int numClientes, numFuncionarios;

	
	//Funciona!!!
	//Pessoa p = new PessoaFisica();
	
	public void adicionarCliente(Pessoa cliente) {
		if(numClientes < MAX_LISTA) {
			clientes[numClientes++] = cliente;
		}
	}
	
	public void adicionarFuncionario(Pessoa funcionario) {
		if(numFuncionarios < MAX_LISTA) {
			funcionarios[numFuncionarios++] = funcionario;
		}
	}
	
	

}
