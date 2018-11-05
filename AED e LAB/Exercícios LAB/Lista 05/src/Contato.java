
public class Contato {
	private String nome;
	private String telefone;
	private String email;
	private String cpf;

	protected Contato clone() {
		Contato resp = new Contato();
		resp.cpf = this.cpf;
		resp.email = this.email;
		resp.nome = this.nome;
		resp.telefone = this.telefone;
		return resp;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", cpf=" + cpf + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
