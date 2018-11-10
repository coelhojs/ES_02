package aula06;

class No{
	char letra;
	Celula primeiro, ultimo;
	No esq, dir;
	
	No(char letra){
		this.letra = letra;
		primeiro = ultimo = null;
		esq = dir = null;
	}
}

public class Aula06Agenda {
	
	No raiz;
	
	Aula06Agenda(){
		raiz = null;
	}
	
	
	void inserir(Contato contato){
		raiz = inserir(contato, raiz);
	}
	
	No inserir(Contato contato, No i){
		if(contato.getNome().charAt(0) == i.letra){
			i.ultimo = new Celula(contato);
			i.ultimo = i.ultimo.prox;
		}else if(contato.getNome().charAt(0) < i.letra){
			i.esq = inserir(contato, i.esq);
		}else{
			i.dir = inserir(contato, i.dir);
		}
		return i;
	}
	
	Contato Pesquisar(String nome){ return Pesquisar(nome, raiz); }
	
	Contato Pesquisar(String nome, No i){
		if(nome.charAt(0) == i.letra){
			Contato resp = null;
			Celula temp = i.primeiro;
			while(i!=null){
				if(temp.contato.getNome().equals(nome)){
					resp = temp.contato.clone();
					i = null;
				}
			}
			return resp;
		}else if(nome.charAt(0) < i.letra){
			return Pesquisar(nome, i.esq);
		}else{
			return Pesquisar(nome, i.dir);
		}
	}



}
