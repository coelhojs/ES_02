package Questão_04;

public class ContaApp {

	public static void main(String[] args) {
		// Testando a criação de 3 contas:
		Conta contaCristiano = new Conta("Cristiano", 1, 892, 1000);
		System.out.println("Nome: " + contaCristiano.getNomeCliente());
		System.out.println("Conta: " + contaCristiano.getConta());
		System.out.println("Agencia: " + contaCristiano.getAgencia());
		System.out.println("Saldo: " + contaCristiano.getSaldo());
		System.out.println();
		Conta contaJoao = new Conta("João", 2, 892, 1000);
		System.out.println("Nome: " + contaJoao.getNomeCliente());
		System.out.println("Conta: " + contaJoao.getConta());
		System.out.println("Agencia: " + contaJoao.getAgencia());
		System.out.println("Saldo: " + contaJoao.getSaldo());
		System.out.println();
		Conta contaPedro = new Conta("Pedro", 3, 299, 1000);
		System.out.println("Nome: " + contaPedro.getNomeCliente());
		System.out.println("Conta: " + contaPedro.getConta());
		System.out.println("Agencia: " + contaPedro.getAgencia());
		System.out.println("Saldo: " + contaPedro.getSaldo());
		contaPedro.sacar(90);
		System.out.println("Sacando R$ 90,00, o novo saldo é: " + contaPedro.getSaldo());

	}

}
