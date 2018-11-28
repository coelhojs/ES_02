package Questão_01;

public class Departamento extends Setor {

	@Override
	public boolean aprovar(Compra compra) {
		if (compra.getValor() <= LIMITE_DEPTO) {
			return true;
		} else {
			return false;
		}
	}
}
