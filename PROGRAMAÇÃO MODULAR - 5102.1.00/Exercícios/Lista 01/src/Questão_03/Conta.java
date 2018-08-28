package Questão_03;

public class Conta {
	private int conta = 0;
	private int agencia;
	private String nomeCliente;
	private float saldo;

	public Conta(String nomeCliente, int conta, float saldo) {
		this.conta = conta;
		this.agencia = 0001;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public Conta() {
	};

	public int getConta() {
		return conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void depositar(float quantia) {
		this.saldo += quantia;
	}

	public void sacar(float quantia) {
		this.saldo -= quantia;
	}

}
