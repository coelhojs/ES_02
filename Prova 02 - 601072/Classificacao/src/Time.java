
public class Time {
	private String nome;
	private int pontos = 0;
	private int gols = 0;

	public Time(String nome, int pontos, int gols) {

		this.nome = nome;
		this.pontos = pontos;
		this.gols = gols;
	}

	public Time(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return this.nome + "   " + this.pontos + "   " + this.gols;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addGols(int gols) {
		this.gols += gols;
	}

	public int getGols() {
		return gols;
	}

	public void addPontos(int pontos) {
		this.pontos += pontos;
	}

	public int getPontos() {
		return pontos;
	}

}
