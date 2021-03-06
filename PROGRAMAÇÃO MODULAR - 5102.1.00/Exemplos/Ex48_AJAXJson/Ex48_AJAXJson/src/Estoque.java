import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Esta classe ir� armazenar uma lista de produtos em estoque.
 * 
 * @author Hugo
 * @version 2016.8.29.10
 *
 */
public class Estoque implements JsonFormatter {
	private static final int MAX_PRODUTOS = 100;
	private Produto[] listaDeProdutos;
	private int numProdutos;

	public Estoque() {
		listaDeProdutos = new Produto[MAX_PRODUTOS];
		numProdutos = 0;
	}
	
	public void adicionar(Produto p) {
		if (numProdutos < MAX_PRODUTOS) {
			listaDeProdutos[numProdutos++] = p;
		}
	}

	public Produto consultar(String descricao) {
		for (int pos = 0; pos < numProdutos; pos++) {
			if (descricao.equalsIgnoreCase(listaDeProdutos[pos].getDescricao())) {
				return listaDeProdutos[pos];
			}
		}
		return null; // Produto n�o encontrado.
	}

	public void remover(String descricao) {
		for (int pos = 0; pos < numProdutos; pos++) {
			if (descricao.equalsIgnoreCase(listaDeProdutos[pos].getDescricao())) {
				// remove produto
				for (int i = pos + 1; i < numProdutos; i++)
					listaDeProdutos[i - 1] = listaDeProdutos[i];
				listaDeProdutos[numProdutos - 1] = null;
				numProdutos--;
			}
		}
	}

	public int getNumProdutos() {
		return numProdutos;
	}

	public int totalEmEstoque() {
		int total = 0;
		for (int i = 0; i < numProdutos; i++)
			total += listaDeProdutos[i].getQuant();
		return total;
	}

	public float valorEmEstoque() {
		float valor = 0;
		for (int i = 0; i < numProdutos; i++)
			valor += listaDeProdutos[i].getQuant() * listaDeProdutos[i].getPreco();
		return valor;
	}

	@Override
	public String toString() {
		StringBuilder valor = new StringBuilder();
		for (int i = 0; i < numProdutos; i++) {
			valor.append(listaDeProdutos[i] + "\n");
		}
		return valor.toString();
	}

	@Override
	public JSONArray toJsonArray() {
		JSONArray array = new JSONArray();
		for (int i = 0; i < numProdutos; i++) {
			array.put(listaDeProdutos[i].toJson());
		}
		return array;
	}

	@Override
	public JSONObject toJson() {
		JSONObject obj = new JSONObject();
		obj.put("numProdutos", this.getNumProdutos());
		obj.put("listaDeProdutos", this.toJsonArray());
		return obj;
	}
	
	

}
