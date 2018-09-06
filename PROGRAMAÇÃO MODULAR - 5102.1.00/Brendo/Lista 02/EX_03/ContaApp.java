package EX_03;

import javax.swing.JOptionPane;

public class ContaApp {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(18498, 7440, 50.00);
        Conta minhaConta2 = new Conta(74897, 1608, 50.00);

        JOptionPane.showMessageDialog(null, "O número da primeira conta é: " + minhaConta.getNum_conta() + " e o seu saldo é: " + minhaConta.getSaldo());
        JOptionPane.showMessageDialog(null, "O número da primeira conta é: " + minhaConta2.getNum_conta() + " e o seu saldo é: " + minhaConta2.getSaldo());

        double meuDeposito = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de deposito na primeira conta: "));
        minhaConta.depositar(meuDeposito);

        double meuSaque = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de saque na primeira conta: "));
        minhaConta.sacar(meuSaque);

        meuDeposito = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de deposito na segunda conta: "));
        minhaConta2.depositar(meuDeposito);

        meuSaque = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de saque na segunda conta: "));
        minhaConta2.sacar(meuSaque);

        JOptionPane.showMessageDialog(null, "O número da primeira conta é: " + minhaConta.getNum_conta() + " e o seu saldo final é: " + minhaConta.getSaldo());
        JOptionPane.showMessageDialog(null, "O número da primeira conta é: " + minhaConta2.getNum_conta() + " e o seu saldo final é: " + minhaConta2.getSaldo());


    }
}
