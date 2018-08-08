import java.io.StringWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import org.json.JSONObject;

public class JsonToJava {

	public static void main(String args[]) {

		Estoque estoque = new Estoque();

		estoque.adicionar(new BemDeConsumo("Leite", 4.00F, 120, LocalDateTime.now(), LocalDate.now().plusMonths(6)));
		estoque.adicionar(new BemDuravel("Televisao", 1200.00F, 30, LocalDateTime.now(), 12));

		Produto p = estoque.consultar("lEItE");

		JSONObject obj = p.toJson();

		JOptionPane.showMessageDialog(null, p.toString() + "\n" + obj, "Estoque de produtos",
				JOptionPane.INFORMATION_MESSAGE);

		JOptionPane.showMessageDialog(null, estoque.toString() + "\n" + estoque.toJson(), "Estoque de produtos",
				JOptionPane.INFORMATION_MESSAGE);

		// Imprimindo em um fluxo de texto
		StringWriter out = new StringWriter();
		estoque.toJson().write(out);

		String jsonText = out.toString();
		System.out.print(jsonText);
	}

}
