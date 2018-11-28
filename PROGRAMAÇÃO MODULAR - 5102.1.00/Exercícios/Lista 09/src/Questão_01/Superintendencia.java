package Questão_01;

public class Superintendencia extends Setor {

	@Override
	public boolean aprovar(Compra compra) {
		if (compra.getValor() <= LIMITE_SUPERINT) {
			return true;
		} else {
			return false;
		}

	}

}
