package Quest�o_07;

public class Contato {
	private String nome;
	private String email;

	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Contato() {

	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
