package Questão_02;

public class Aviao {
	private String nome;
	private int identificador = 0;

	public Aviao(String nome) {
		this.nome = nome;
		this.identificador = identificador++;
	}

	public Aviao() {
		this.identificador++;
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

	public void setIdentificador() {
		this.identificador = identificador++;
	}
}
