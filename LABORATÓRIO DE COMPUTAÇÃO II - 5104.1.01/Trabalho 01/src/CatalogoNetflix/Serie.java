package CatalogoNetflix;

public class Serie {
	private String nome, tipo, duracao, pais, idioma, emissora, transmissao, numTemporadas, numEpisodios;

	public Serie(String nome, String tipo, String duracao, String pais, String idioma, String emissora,
			String transmissao, String numTemporadas, String numEpisodios) {
		this.nome = nome;
		this.tipo = tipo;
		this.duracao = duracao;
		this.pais = pais;
		this.idioma = idioma;
		this.emissora = emissora;
		this.transmissao = transmissao;
		this.numTemporadas = numTemporadas;
		this.numEpisodios = numEpisodios;
	}

	public Serie() {
	};

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDuracao() {
		return duracao;
	}

	public String getPais() {
		return pais;
	}

	public String getIdioma() {
		return idioma;
	}

	public String getEmissora() {
		return emissora;
	}

	public String getTransmissao() {
		return transmissao;
	}

	public String getNumTemporadas() {
		return numTemporadas;
	}

	public String getNumEpisodios() {
		return numEpisodios;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void setEmissora(String emissora) {
		this.emissora = emissora;
	}

	public void setTransmissao(String transmissao) {
		this.transmissao = transmissao;
	}

	public void setNumTemporadas(String numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public void setNumEpisodios(String numEpisodios) {
		this.numEpisodios = numEpisodios;
	}
}
