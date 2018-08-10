
public class Aula02 {
//MÉTODOS RECURSIVOS
	boolean verificaigualdade (String primeira, String segunda) {
		
	};
	static int contaConsoantes (String origem, int i){
		int resp;
		
		if (i == origem.length())
			resp = 0;
		else if(!isVogal(origem.charAt(1)))
			resp = 1 + contaConsoantes(origem, i+1);
		
	};
	String toUpper (String palavra);
}
