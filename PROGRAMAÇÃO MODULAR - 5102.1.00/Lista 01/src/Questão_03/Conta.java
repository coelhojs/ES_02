package Questão_03;

public class Conta {
	private int conta;
	private int agencia;
	private String cliente;
	private float saldo;

	public Conta(String cliente, float saldo) {
		this.conta = 0;
		this.agencia = 0001;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public Conta() {
		
	}

	public int getConta() {
		return conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public String getCliente() {
		return cliente;
	}
	public float getSaldo() {
		return saldo;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


}
