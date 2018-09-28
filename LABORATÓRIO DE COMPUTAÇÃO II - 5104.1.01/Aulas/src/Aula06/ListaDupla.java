package Aula06;

public class ListaDupla {
	CelulaDupla primeiro, ultimo;

	ListaDupla() {
		primeiro = new CelulaDupla();
		ultimo = primeiro;
	}

	void inserirFim(Contato, item) {
		ultimo.prox = new CelulaDupla(item);
		ultimo.prox.ant = ultimo;
		ultimo=ultimo.prox;
	}

	void inserirInicio(Contato item) {
		CelulaDupla temp = new CelulaDupla(item);
		temp.prox = primeiro.prox;
		primeiro.prox = temp;
		if (primeiro == ultimo) {
			ultimo = temp;
		}
		temp = null;
	}

	Contato RemoverInicio() {
		CelulaDupla = temp = primeiro;
		primeiro = primeiro.prox;
		primeiro.ant = null;
		Contato item = primeiro.elemento;
		temp.prox = null;
		temp = null;
		return item;
	}

	Contato RemoverFinal() throws Exception {
		if (ultimo == primeiro) {
			throw new Exception("Lista vazia");
		}
		Contato item = ultimo.elemento;
		ultimo = ultimo.ant;
		ultimo.prox.ant = null;
		ultimo.prox = null;
		return item;
	}
}
