package EX_03;

public class Conta {
    private int num_conta;
    private int agencia;
    private double saldo;

    public Conta(int num_conta, int agencia, double saldo) {
        this.num_conta = num_conta;
        this.agencia = agencia;
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public Conta() {
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if (valor <= 0) {
            this.saldo = getSaldo();
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            this.saldo = getSaldo();
        } else {
            this.saldo -= valor;
        }

    }
}
