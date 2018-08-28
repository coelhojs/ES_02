package Questão_04;

public class ConversorDistancias {
	private double centimetros;
	private double polegadas;
	private double metros;
	private double pes;

	public ConversorDistancias(double centimetros, double polegadas, double metros, double pes) {
		this.centimetros = centimetros;
		this.polegadas = polegadas;
		this.metros = metros;
		this.pes = pes;
	}

	ConversorDistancias() {
	}

	public double getCentimetros() {
		return centimetros;
	}

	public double getPolegadas() {
		return polegadas;
	}

	public double getMetros() {
		return metros;
	}

	public double getPes() {
		return pes;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}

	public void setCentimetros(double centimetros) {
		this.centimetros = centimetros;
	}

	public double pesParaMetros(double pes) {
		metros = pes * 0.3048;
		return metros;
	}

	double pesParaPolegadas(double pes) {
		polegadas = pes * 12;
		return polegadas;
	}

	double pesParaCentimetros(double pes) {
		centimetros = pes * 30.48;
		return centimetros;
	}

	double polegadasParaMetros(double polegadas) {
		metros = polegadas * 0.0254;
		return metros;
	}

	double polegadasParaPes(double polegadas) {
		pes = polegadas * 0.083333;
		return pes;
	}

	double polegadasParaCentimetros(double polegadas) {
		centimetros = polegadas / 0.39370;
		return centimetros;
	}

	double metrosParaPes(double metros) {
		pes = metros * 3.2808;
		return pes;
	}

	double metrosParaPolegadas(double metros) {
		polegadas = metros * 39.370;
		return polegadas;
	}

	double metrosParaCentimetros(double metros) {
		centimetros = metros / 0.010000;
		return centimetros;
	}

	double centimetrosParaPes(double centimetros) {
		pes = centimetros * 0.032808;
		return pes;
	}

	double centimetrosParaPolegadas(double centimetros) {
		polegadas = centimetros * 0.393701;
		return polegadas;
	}

	double centimetrosParaMetros(double centimetros) {
		metros = centimetros / 100.00;
		return metros;
	}
}