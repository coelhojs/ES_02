package Questão_03;

public class Empresa {

	private static final int MAX_LISTA = 100;
	private PessoaFisica[] clientesPF;
	private PessoaJuridica[] clientesPJ;
	public PessoaFisica funcionarios[];
	private int numClientesPJ, numClientesPF, numFuncionarios;

	public void adicionarCliente(PessoaFisica cliente) {
		if(numClientesPF < MAX_LISTA) {
			clientesPF[numClientesPF++] = cliente;
		}
	}
	
	public void adicionarCliente(PessoaJuridica cliente) {
		if(numClientesPF < MAX_LISTA) {
			clientesPJ[numClientesPJ++] = cliente;
		}
	}
	
	public void adicionarFuncionario(PessoaFisica funcionario) {
		if(numFuncionarios < MAX_LISTA) {
			funcionarios[numFuncionarios++] = funcionario;
		}
	}
	
	

}
