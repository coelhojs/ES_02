package EX_03;

import javax.swing.*;

public class Aplicacao {
    public static void main(String[] args) {
        PessoaFisica pf;
        PessoaJuridica pj;
        Cliente cliente;

        String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionário: "));
        String sexo = JOptionPane.showInputDialog("Digite o sexo do funcionário: ");
        String cpf = JOptionPane.showInputDialog("Digite o cpf do funcionário: ");

        pf = new PessoaFisica(nome, idade, sexo, cpf);

        Funcionario funcionario = new Funcionario("Professor", 10000.00, pf);
        Empresa empresa = new Empresa("Puc Minas");

        empresa.addFuncionario(funcionario);
        JOptionPane.showMessageDialog(null, empresa.getFuncionarios(), "Funcionários adicionados",
                JOptionPane.PLAIN_MESSAGE);

        nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        sexo = JOptionPane.showInputDialog("Digite o sexo do cliente: ");
        String tipoPessoa = JOptionPane.showInputDialog("O cliente é pessoa física ou jurídica? PessoaFisica(pf), PessoaJuridica(pj) ");

        if (tipoPessoa.equals("pf")) {
            cpf = JOptionPane.showInputDialog("Digite o cpf do cliente: ");
            pf = new PessoaFisica(nome, idade, sexo, cpf);
            cliente = new Cliente(2000.00, pf);
        } else {
            String cnpj = JOptionPane.showInputDialog("Digite o cnpj do cliente: ");
            pj = new PessoaJuridica(nome, idade, sexo, cnpj);
            cliente = new Cliente(2000.00, pj);
        }

        empresa.addCliente(cliente);

        JOptionPane.showMessageDialog(null, empresa.getClientes(), "Clientes adicionados",
                JOptionPane.PLAIN_MESSAGE);



    }
}
