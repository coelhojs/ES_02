package Questao_05;

public class PessoaJuridica extends Pessoa {
	private long cnpj;

	public PessoaJuridica(String nome, String endereco, String cidade, String uF, int telefone, int cep, long cnpj) {
		super(nome, endereco, cidade, uF, telefone, cep);
		this.cnpj = cnpj;
	}

	public PessoaJuridica() {

	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

}
