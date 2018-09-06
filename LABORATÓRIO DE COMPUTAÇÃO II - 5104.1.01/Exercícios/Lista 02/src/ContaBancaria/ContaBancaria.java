package ContaBancaria;
public class ContaBancaria {
	private float saldo, saldoMinimo;

	ContaBancaria(float saldo) {
		this.saldo = saldo;
	}

	ContaBancaria(float saldo, float saldoMinimo) {
		this.saldo = saldo;
		this.saldoMinimo = saldoMinimo;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public float getSaldoMinimo() {
		return this.saldoMinimo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void setSaldoMinimo(float saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	float sacar(float quantia) {
		setSaldo(getSaldo() - quantia);
		return this.saldo;
	}

	float depositar(float quantia) {
		setSaldo(getSaldo() + quantia);
		return this.saldo;
	}

	float alterarSaldoMinimo(float novoSaldoMinimo) {
		setSaldoMinimo(novoSaldoMinimo);
		return this.saldoMinimo;
	}

	public static void main(String[] args) {
		ContaBancaria CJoao = new ContaBancaria(1000, 0);
		ContaBancaria CPedro = new ContaBancaria(1650, 0);
		System.out.println("O saldo inicial de Joao e: " + CJoao.getSaldo());
		System.out.println("Depositando 50 reais na conta do Joao, o novo saldo é: " + CJoao.depositar(50));
		System.out.println("Sacando R$ 851,45. Novo saldo : " + CJoao.sacar(851.45F));
		System.out.println(" ");
		System.out.println("O saldo de inicial de Pedro e: " + CPedro.getSaldo());
		System.out.println("Depositando R$ 9110,21 na conta do Pedro, o novo saldo é: " + CPedro.depositar(9110.21F));
		System.out.println("Sacando R$ 8,78. Novo saldo : " + CPedro.sacar(8.78F));

		ContaBancaria[] c = new ContaBancaria[10];

		for (int i = 0; i < c.length; i++) {
			c[i] = new ContaBancaria(0);
		}
		c[0].depositar(200);

	}
}