package EX_03;

public class Funcionario {

    private String cargo;
    private double salario;
    private PessoaFisica pessoaFisica;

    public Funcionario(String cargo, double salario, PessoaFisica pessoaFisica) {
        this.cargo = cargo;
        this.salario = salario;
        this.pessoaFisica = pessoaFisica;
    }

    public Funcionario() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    @Override
    public String toString() {
        return  "cargo='" + cargo + '\'' +
                ", salario=" + salario;
    }
}
