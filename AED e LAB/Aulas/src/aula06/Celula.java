package aula06;

public class Celula{
	Contato contato;
	Celula prox;
	
	Celula(){
		this.contato = null;
		this.prox = null;
	}
	
	Celula(Contato contato){
		this.contato = contato;
		this.prox = null;
	}
}
