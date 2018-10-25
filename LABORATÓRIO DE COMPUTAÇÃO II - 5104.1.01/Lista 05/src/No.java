
public class No {
	char letra;
	Celula primeiro, ultimo;
	No esq, dir;

	No(char letra) {
		this.letra = letra;
		primeiro = ultimo = null;
		esq = dir = null;
	}
}