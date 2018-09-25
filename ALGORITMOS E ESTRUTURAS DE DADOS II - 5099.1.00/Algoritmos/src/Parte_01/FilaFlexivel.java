package Parte_01;

public class FilaFlexivel {
	public Celula primeiro, ultimo;

	public FilaFlexivel() {
		this.primeiro = new Celula();
		this.ultimo = primeiro;
	}

	public void inserir(int x) {
		ultimo.prox = new Celula(x);
		ultimo = ultimo.prox;
	}

	public int remover() throws Exception{
		if (primeiro == ultimo) 
		throw new Exception("Erro!");
		Celula tmp = primeiro;
		primeiro = primeiro.prox;
		int elemento = primeiro.elemento;
		tmp.prox = null;
		tmp = null;
		return elemento;
		}
	
	public void mostrar() {
		// Exercício: Implemente este método
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
