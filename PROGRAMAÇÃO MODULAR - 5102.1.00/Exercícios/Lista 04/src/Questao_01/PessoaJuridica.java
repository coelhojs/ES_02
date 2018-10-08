package Questao_01;

public class PessoaJuridica extends Pessoa {
	private long cnpj;

	public PessoaJuridica(String nome, String endereco, int telefone, long cnpj) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
	}

	public PessoaJuridica() {
		super();
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
}
