/*1 - Implemente a classe conta descrita anteriormente. Crie os atributos citados e mais um identiﬁ-
cador para o número da conta corrente. Crie um método main que constroi dois objetos da classe conta
utilizando a cláusula new como descrito na classe Data. Teste as funções sacar e depositar, imprimindo
os resultados na tela.*/

public class ContaBancaria {
	private float saldoConta, saldoMinimoConta;
	public float saldo, saldoMinimo;

	ContaBancaria(float saldo) {
		this.saldoConta = saldo;
	}

	ContaBancaria(float saldo, float saldoMinimo) {
		this.saldoConta = saldo;
		this.saldoMinimoConta = saldoMinimo;
	}

	public float getSaldo() {
		return saldoConta;
	}

	public float getSaldoMinimo() {
		return saldoMinimoConta;
	}

	public void setSaldo(float saldo) {
		this.saldoConta = saldo;
	}

	public void setSaldoMinimo(float saldoMinimo) {
		this.saldoMinimoConta = saldoMinimo;
	}

	float sacar(float quantia) {
		saldo = getSaldo();
		saldo -= quantia;
		setSaldo(saldo);
		return saldo;
	}

	float depositar(float quantia) {
		float saldoAnterior = getSaldo();
		setSaldo(saldoAnterior + quantia);
		saldo = getSaldo();
		return saldo;
	}

	float alterarSaldoMinimo(float novoSaldoMinimo) {
		setSaldoMinimo(novoSaldoMinimo);
		saldoMinimo = getSaldoMinimo();
		return saldoMinimo;
	}

	float consultarSaldo() {
		saldo = getSaldo();
		return saldo;
	}

	public static void main(String[] args) {
		ContaBancaria CJoao = new ContaBancaria(1000, 0);
		ContaBancaria CPedro = new ContaBancaria(1650, 0);
		System.out.println("O saldo inicial de Joao e: " + CJoao.getSaldo());
		System.out.println("Depositando 50 reais na conta do Joao, o novo saldo é: " + CJoao.depositar(50));
		System.out.println("Sacando R$ 851,45. Novo saldo : " + CJoao.sacar(851.45F));
		System.out.println(" ");
		System.out.println("O saldo de inicial de Pedro e: " + CPedro.getSaldo());
		System.out.println("Depositando 9110,21 reais na conta do Pedro, o novo saldo é: " + CPedro.depositar(9110.21F));
		System.out.println("Sacando R$ 8,78. Novo saldo : " + CPedro.sacar(8.78F));

	}

}
