package EX_03;

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


    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    @Override
    public String toString() {
        return "O limite de crédito do cliente em questão é: " + limiteCredito;
    }
}
