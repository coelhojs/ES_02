public class ContaBancaria {
	private float saldo, saldoMinimo;

	ContaBancaria(float saldo) {
		this.saldo = saldo;
	}

	ContaBancaria(float saldo, float saldoMinimo) {
		this.saldo = saldo;
		this.saldoMinimo = saldo;
	}

	float Sacar(float quantia) {
		saldo -= quantia;
		return saldo;
	}

	float Depositar(float quantia) {
		return saldo;
	}

	float AlterarSaldoMinimo(float novoSaldo) {
		return saldo;
	}

	float ConsultarSaldo() {
		return saldo;
	}

	public static void main(String[] args) {
		ContaBancaria CJoao = new ContaBancaria(1000);
		
		System.out.println("Saldo: " + CJoao.saldo);
	}

}
