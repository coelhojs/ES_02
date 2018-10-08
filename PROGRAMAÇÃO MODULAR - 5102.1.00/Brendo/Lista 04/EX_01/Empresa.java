package EX_01;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();

    private Endereco endereco;


    public Empresa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Empresa(String nome) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Empresa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        funcionarios.remove(cliente);
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }
}
