public class Pessoa {
	private String nome;
	private long cpf;
	private int idade;
	private String sexo;

	public Pessoa(String nome, long cpf, int idade, String sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;

	}

	public String getNome() {
		return nome;
	}

	public long getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Boolean isMaiorIdade() {
		idade = getIdade();
		if (idade >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean cpfTypeLong() {
		cpf = getCpf();
		if (cpf == 11254085610L/* cpf instanceof long */) {
			return true;
		} else {
			return false;
		}
	}

}