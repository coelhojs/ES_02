package EX_01;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nome, int idade, String sexo, String cnpj, Endereco endereco) {
        super(nome, idade, sexo, endereco);
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, int idade, String sexo, String cnpj) {
        super(nome, idade, sexo);
        this.cnpj = cnpj;
    }


    public PessoaJuridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
