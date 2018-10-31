package Questão_04_OK;

import java.time.LocalDate;

public class Peca extends Item {
	private String tipo;
	private LocalDate garantia;

	public Peca(String nome, double preco, String tipo, LocalDate garantia) {
		super(nome, preco);
		this.tipo = tipo;
		this.garantia = garantia;
	}

	@Override
	public String toString() {
		return super.toString() + " Tipo: " + this.tipo + " Garantia: " + this.garantia;
	}

	public String getTipo() {
		return tipo;
	}

	public LocalDate getGarantia() {
		return garantia;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setGarantia(LocalDate garantia) {
		this.garantia = garantia;
	}

}
