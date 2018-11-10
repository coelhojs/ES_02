package aula05;
public class Celula {
	public int elemento;
	public Celula prox;
	
	Celula(){
		this(0);
	}
	
	Celula(int elemento){
		this.elemento = elemento;
		this.prox = null;
	}
	
}
