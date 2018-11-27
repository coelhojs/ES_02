package Questao_01;

public class ClientePF extends Cliente {

	public ClientePF(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
