
public class Aplicacao {

	public static void main(String[] args) {
		CalculadoraIMC calcImc = new CalculadoraIMC(70, 1.60);
		
		
		calcImc.calcular();
		
		System.out.println("O IMC é: " + calcImc.getImc());

		if (calcImc.isSobrepeso()) {
			System.out.println("Tem sobrepeso.");
		}

	}

}
