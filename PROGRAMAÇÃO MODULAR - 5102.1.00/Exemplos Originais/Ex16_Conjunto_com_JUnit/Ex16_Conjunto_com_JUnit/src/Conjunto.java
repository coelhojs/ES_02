
public class Conjunto {
	private int tamanho = 0;
	public static final int MAX = 10;
	private Object[] items = new Object[MAX];

	public int tamanho() {
		return tamanho;
	}

	public boolean contem(Object o) {
		for (int i = 0; i < MAX; i++) {
			if (items[i] == o) {
				return true;
			}
		}
		return false;
	}

	public void adicionar(Object o) {
		if (!contem(o)) {
			items[tamanho++] = o;
		}
	}
}
