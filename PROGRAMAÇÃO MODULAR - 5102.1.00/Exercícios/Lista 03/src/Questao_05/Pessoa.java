package Questao_05;

public class Pessoa extends Endereco {

	public Pessoa(String nome, String endereco, String cidade, String uF, int telefone, int cep) {
		super(nome, endereco, cidade, uF, telefone, cep);
	}

	public Pessoa() {
		super();
		this.setNome("Nome Padr�o");
		this.setEndereco("Rua Padr�o");
		this.setTelefone(12345678);
	}
	
	
	
}