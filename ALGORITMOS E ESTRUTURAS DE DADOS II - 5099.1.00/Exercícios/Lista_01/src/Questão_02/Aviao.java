package Questão_02;

public class Aviao {
	private String nome;
	private int identificador;

	public Aviao(String nome, int identificador) {
		this.nome = nome;
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;

	}

}
