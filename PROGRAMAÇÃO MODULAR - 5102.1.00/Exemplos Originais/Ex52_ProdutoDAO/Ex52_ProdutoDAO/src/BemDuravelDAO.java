import java.util.ArrayList;
import java.util.List;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDateTime;

public class BemDuravelDAO implements ProdutoDAO<BemDuravel, String> {

	public BemDuravelDAO() {

	}

	@Override
	public void add(BemDuravel p) {
		BemDuravel b = (BemDuravel) p;
		try (DataOutputStream saida = new DataOutputStream(new FileOutputStream("bemduravel.dat", true))) {
			saida.writeUTF(b.getDescricao());
			saida.writeFloat(b.getPreco());
			saida.writeInt(b.getQuant());
			saida.writeUTF(b.getDataFabricacao().toString());
			saida.writeInt(b.getMesesGarantia());
			saida.flush();

		} catch (Exception e) {
			System.out.println("ERRO ao gravar o Bem de Consumo '" + b.getDescricao() + "' no disco!");
			e.printStackTrace();
		}
	}

	@Override
	public BemDuravel get(String chave) {
		BemDuravel retorno = null;
		BemDuravel b = null;
		String idSTR;

		try (DataInputStream entrada = new DataInputStream(new FileInputStream("bemduravel.dat"))) {
			while ((idSTR = entrada.readUTF()) != null) {
				b = new BemDuravel();
				b.setDescricao(idSTR);
				b.setPreco(entrada.readFloat());
				b.setQuant(entrada.readInt());
				b.setDataFabricacao(LocalDateTime.parse(entrada.readUTF()));
				b.setMesesGarantia(entrada.readInt());

				if (chave.equals(b.getDescricao())) {
					retorno = b;
					break;
				}
			}
		} catch(EOFException e) { 

		} catch (Exception e) {
			System.out.println("ERRO ao ler o Bem de Consumo '" + b.getDescricao() + "' do disco rígido!");
			e.printStackTrace();
		}
		return (BemDuravel) retorno;
	}

	@Override
	public List<BemDuravel> getAll() {
		List<BemDuravel> produtos = new ArrayList<BemDuravel>();
		BemDuravel b = null;
		String idSTR;

		try (DataInputStream entrada = new DataInputStream(new FileInputStream("bemduravel.dat"))) {
			while ((idSTR = entrada.readUTF()) != null) {
				b = new BemDuravel();
				b.setDescricao(idSTR);
				b.setPreco(entrada.readFloat());
				b.setQuant(entrada.readInt());
				b.setDataFabricacao(LocalDateTime.parse(entrada.readUTF()));
				b.setMesesGarantia(entrada.readInt());
				
				produtos.add(b);
			}
		} catch(EOFException e) { 

		} catch (Exception e) {
			System.out.println("ERRO ao ler o Bem de Consumo '" + b.getDescricao() + "' do disco rígido!");
			e.printStackTrace();
		}
		return (List<BemDuravel>) produtos;
	}

	@Override
	public void update(BemDuravel p) {
		List<BemDuravel> produtos = getAll();
		int index = produtos.indexOf(p);
		if (index != -1) {
			produtos.set(index,p);
		}
		saveToFile(produtos);
	}

	@Override
	public void delete(BemDuravel p) {
		List<BemDuravel> produtos = getAll();
		int index = produtos.indexOf(p);
		if (index != -1) {
			produtos.remove(index);
		}
		saveToFile(produtos);
	}

	private void saveToFile(List<BemDuravel> produtos) {
		try (DataOutputStream saida = 
			new DataOutputStream(new FileOutputStream("bemduravel.dat", false))) {
			for (BemDuravel b : produtos) {
				saida.writeUTF(b.getDescricao());
				saida.writeFloat(b.getPreco());
				saida.writeInt(b.getQuant());
				saida.writeUTF(b.getDataFabricacao().toString());
				saida.writeInt(b.getMesesGarantia());
				saida.flush();
			}

		} catch (Exception e) {
			System.out.println("ERRO ao gravar o Bens duraveis no disco!");
			e.printStackTrace();
		}
	}

}