import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BemDeConsumoDAO implements ProdutoDAO<BemDeConsumo, String> {

	public BemDeConsumoDAO() {

	}

	@Override
	public void add(BemDeConsumo p) {
		BemDeConsumo b = p;
		try (BufferedWriter buffer_saida = new BufferedWriter(new FileWriter("bemdeconsumo.txt", true))) {
			String separadorDeLinha = System.getProperty("line.separator");
			buffer_saida.write(b.getDescricao() + separadorDeLinha);
			buffer_saida.write(b.getPreco() + separadorDeLinha);
			buffer_saida.write(b.getQuant() + separadorDeLinha);
			buffer_saida.write(b.getDataFabricacao() + separadorDeLinha);
			buffer_saida.write(b.getDataValidade() + separadorDeLinha);
			buffer_saida.flush();

		} catch (Exception e) {
			System.out.println("ERRO ao gravar o Bem de Consumo '" + b.getDescricao() + "' no disco!");
			e.printStackTrace();
		}
	}

	@Override
	public BemDeConsumo get(String chave) {
		BemDeConsumo retorno = null;
		BemDeConsumo b = null;

		try (BufferedReader buffer_entrada = new BufferedReader(new FileReader("bemdeconsumo.txt"))) {
			String idSTR;

			while ((idSTR = buffer_entrada.readLine()) != null) {
				b = new BemDeConsumo();
				b.setDescricao(idSTR);
				b.setPreco(Float.parseFloat(buffer_entrada.readLine()));
				b.setQuant(Integer.parseInt(buffer_entrada.readLine()));
				b.setDataFabricacao(LocalDateTime.parse(buffer_entrada.readLine()));
				b.setDataValidade(LocalDate.parse(buffer_entrada.readLine()));

				if (chave.equals(b.getDescricao())) {
					retorno = b;
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("ERRO ao ler o Bem de Consumo '" + b.getDescricao() + "' do disco rígido!");
			e.printStackTrace();
		}
		return retorno;
	}

	@Override
	public List<BemDeConsumo> getAll() {
		List<BemDeConsumo> produtos = new ArrayList<BemDeConsumo>();
		BemDeConsumo b = null;
		try (BufferedReader buffer_entrada = new BufferedReader(new FileReader("bemdeconsumo.txt"))) {
			String idSTR;

			while ((idSTR = buffer_entrada.readLine()) != null) {
				b = new BemDeConsumo();
				b.setDescricao(idSTR);
				b.setPreco(Float.parseFloat(buffer_entrada.readLine()));
				b.setQuant(Integer.parseInt(buffer_entrada.readLine()));
				b.setDataFabricacao(LocalDateTime.parse(buffer_entrada.readLine()));
				b.setDataValidade(LocalDate.parse(buffer_entrada.readLine()));
				produtos.add(b);
			}
		} catch (Exception e) {
			System.out.println("ERRO ao ler os Bens de Consumo do disco rígido!");
			e.printStackTrace();
		}
		return produtos;
	}

	@Override
	public void update(BemDeConsumo p) {
		List<BemDeConsumo> produtos = getAll();
		int index = produtos.indexOf(p);
		if (index != -1) {
			produtos.set(index, p);
		}
		saveToFile(produtos);
	}

	@Override
	public void delete(BemDeConsumo p) {
		List<BemDeConsumo> produtos = getAll();
		int index = produtos.indexOf(p);
		if (index != -1) {
			produtos.remove(index);
		}
		saveToFile(produtos);
	}

	private void saveToFile(List<BemDeConsumo> produtos) {
		try (BufferedWriter buffer_saida = new BufferedWriter(new FileWriter("bemdeconsumo.txt", false))) {

			String separadorDeLinha = System.getProperty("line.separator");
			for (BemDeConsumo b : produtos) {
				buffer_saida.write(b.getDescricao() + separadorDeLinha);
				buffer_saida.write(b.getPreco() + separadorDeLinha);
				buffer_saida.write(b.getQuant() + separadorDeLinha);
				buffer_saida.write(b.getDataFabricacao() + separadorDeLinha);
				buffer_saida.write(b.getDataValidade() + separadorDeLinha);
				buffer_saida.flush();
			}
		} catch (Exception e) {
			System.out.println("ERRO ao gravar o Bens de Consumo no disco!");
			e.printStackTrace();
		}
	}

}