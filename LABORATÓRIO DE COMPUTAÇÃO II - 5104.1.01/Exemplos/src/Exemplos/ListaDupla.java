package Exemplos;

public class ListaDupla {

	CelulaDupla primeiro, ultimo;

	ListaDupla() {
		primeiro = new CelulaDupla();
		ultimo = primeiro;
	}

	void inserirFim(Contato item) {
		ultimo.prox = new CelulaDupla(item);
		ultimo.prox.ant = ultimo;
		ultimo = ultimo.prox;
	}

	void inserirInicio(Contato item) {
		CelulaDupla temp = new CelulaDupla(item);
		temp.prox = primeiro.prox;
		temp.ant = primeiro;
		primeiro.prox = temp;
		if (primeiro == ultimo)
			ultimo = temp;
		else
			temp.prox.ant = temp;
		temp = null;
	}

	Contato RemoverInicio() throws Exception {
		if (ultimo == primeiro)
			throw new Exception("Lista Vazia");
		CelulaDupla temp = primeiro;
		primeiro = primeiro.prox;
		Contato item = primeiro.elemento;
		primeiro.ant = null;
		temp.prox = null;
		temp = null;
		return item;
	}

	Contato RemoverFinal() throws Exception {
		if (ultimo == primeiro)
			throw new Exception("Lista Vazia");
		Contato item = ultimo.elemento;
		ultimo = ultimo.ant;
		ultimo.prox.ant = null;
		ultimo.prox = null;
		return item;
	}
}
