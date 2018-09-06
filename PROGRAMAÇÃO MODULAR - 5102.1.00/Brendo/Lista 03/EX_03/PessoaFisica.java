package EX_03;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String nome, int idade, String sexo, String cpf) {
        super(nome, idade, sexo);
        this.cpf = cpf;
    }

    public PessoaFisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
