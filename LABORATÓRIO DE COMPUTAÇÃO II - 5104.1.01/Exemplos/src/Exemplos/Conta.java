package Exemplos;

public class Conta {

	private float saldo;

	private float saldoMinimo;

	Conta(float saldo) {
		this.saldo = saldo;
	}

	Conta(float saldo, float saldoMinimo) {
		this.saldo = saldo;
		this.saldoMinimo = saldo;
	}

	void depositar(float quantia) {
		saldo += quantia;
	}

	void saque(float quantia) throws Exception {
		if (saldo - quantia < saldoMinimo)
			throw new Exception("Saldo insuficiente");

		saldo -= quantia;
	}

	float getSaldo() {
		return saldo;
	}

}
