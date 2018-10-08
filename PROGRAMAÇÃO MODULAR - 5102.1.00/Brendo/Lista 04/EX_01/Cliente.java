package EX_01;

public class Cliente {

    private double limiteCredito;
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;

    public Cliente(double limiteCredito, PessoaFisica pessoaFisica) {
        this.limiteCredito = limiteCredito;
        this.pessoaFisica = pessoaFisica;
    }

    public Cliente(double limiteCredito, PessoaJuridica pessoaJuridica) {
        this.limiteCredito = limiteCredito;
        this.pessoaJuridica = pessoaJuridica;
    }

    public Cliente() {
    }


    @Override
    public String toString() {
        return "O limite de crédito do cliente em questão é: " + limiteCredito;
    }
}
