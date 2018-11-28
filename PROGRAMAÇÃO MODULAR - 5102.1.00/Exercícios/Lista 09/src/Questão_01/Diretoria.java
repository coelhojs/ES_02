package Questão_01;

public class Diretoria extends Setor {

	@Override
	public boolean aprovar(Compra compra) {
		if (compra.getValor() <= LIMITE_DIR) {
			return true;
		} else {
			return false;
		}
	}

}
