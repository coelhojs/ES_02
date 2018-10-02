package Exemplos;

public class CelulaDupla {
	Contato elemento;
	CelulaDupla ant, prox;

	CelulaDupla() {
		this(new Contato("", ""));
	}

	CelulaDupla(Contato elemento) {
		this.elemento = elemento;
		ant = prox = null;
	}

}
