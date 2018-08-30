package Questão_04;

public class Conta {
	private int conta = 0;
	private int agencia;
	private String nomeCliente;
	private float saldo;
	private static int identificador = 1;
	
	public Conta(String nomeCliente, int conta, int agencia, float saldo) {
		this.conta = identificador++;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getConta() {
		return this.conta;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void depositar(float quantia) {
		this.saldo += quantia;
	}

	public void sacar(float quantia) {
		this.saldo -= quantia;
	}

}
