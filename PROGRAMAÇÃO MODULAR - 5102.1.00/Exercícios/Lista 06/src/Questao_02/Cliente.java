package Questao_02;

public class Cliente {
	private String endereco, nome, sexo;
	private double limiteCredito;
	private int telefone, idade;
	private long cpf, cnpj;

	public Cliente(PessoaFisica pf, double limiteCredito) {
		this.nome = pf.getNome();
		this.cpf = pf.getCpf();
		this.endereco = pf.getEndereco();
		this.telefone = pf.getTelefone();
		this.idade = pf.getIdade();
		this.sexo = pf.getSexo();
		this.limiteCredito = limiteCredito;
	}

	public Cliente(PessoaJuridica pj, double limiteCredito) {
		this.nome = pj.getNome();
		this.cnpj = pj.getCnpj();
		this.endereco = pj.getEndereco();
		this.telefone = pj.getTelefone();
		this.limiteCredito = limiteCredito;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public int getTelefone() {
		return telefone;
	}

	public int getIdade() {
		return idade;
	}

	public long getCpf() {
		return cpf;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
}
