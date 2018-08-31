package Questão_04;

public class Conta {
	private int id;
	private String nomeCliente;
	private int agencia;
	private int conta = 0;
	private float saldo;
	private static int identificador = 1;

	public Conta(String nomeCliente, int conta, int agencia, float saldo) {
		this.id = identificador++;
		this.nomeCliente = nomeCliente;
		this.agencia = agencia;
		this.conta = conta;
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

	public int getID() {
		return this.id;
	}

}
