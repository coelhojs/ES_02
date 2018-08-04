
public class Revisao {

	public static void main(String[] args) {
		int numCirc = Integer.parseInt(args[0]);

		double[] raios = new double[numCirc];
		double[] areas = new double[numCirc];

		Constante pi = new Constante();
		pi.nome = "PI";
		pi.valor = 3.1415926;
		
		
		for (int i = 0; i < numCirc; i++) {
			raios[i] = i+1; //Math.random();
			areas[i] = pi.valor * raios[i] * raios[i];
			System.out.println("Raio (" + i + ") = " + raios[i] + " area = "+ areas[i]);
		}

	}

}

class Constante {
	String nome;
	double valor;
}