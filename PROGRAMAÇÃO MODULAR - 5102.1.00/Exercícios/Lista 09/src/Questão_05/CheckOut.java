//Criar interface Pagamento com os métodos de pagamento
//Modificar "aceitaDinheiro" para "aceita"

package Questão_05;


	void checkOut(Recibo recibo) {
		Moeda total = Moeda.zero;
	
		for(item : items){
			total += item.getPreco();
			recibo.addItem(item);
		}
		
		switch(opcaoPagto) {
		case 1:
			Pagamento dinheiro = aceitaDinheiro(total);
			recibo.addPagamento(dinheiro);
		break;
		case 2:
			Pagamento cartao = aceitaCartao(total);
			recibo.addPagamento(cartao);	
		}	
	}