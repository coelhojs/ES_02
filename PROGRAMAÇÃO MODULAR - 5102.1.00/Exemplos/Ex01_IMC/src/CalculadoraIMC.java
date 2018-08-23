/**
 * Código inspirado em Beginning Java Programming (2015) - Bart Baesens and Aimée Backiel
 * Capítulo 1
 * 
 * @author Bart Baesens and Aimée Backiel
 * @version 2017.8.1
 **/

public class CalculadoraIMC {
	private double peso, altura, imc;
	
	public CalculadoraIMC(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public void calcular() {
		this.imc = peso / (altura * altura);
	}
	
	public boolean isSobrepeso() {
		return (imc > 25);
	}
	
	public double getImc() {
		return this.imc;
	}
}
