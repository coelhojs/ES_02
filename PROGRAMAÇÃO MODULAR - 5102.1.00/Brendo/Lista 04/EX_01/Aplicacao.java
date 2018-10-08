package EX_01;

import javax.swing.*;
import java.util.Locale;

public class Aplicacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Empresa empresa;

        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        String sexo = JOptionPane.showInputDialog("Digite o sexo (m/f): ");

        String response = JOptionPane.showInputDialog("Pessoa física ou jurídica (f/j)? ");

        if (response.equals("f")) {
            String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
            PessoaFisica pf = new PessoaFisica(nome, idade, sexo, cpf);

            response = JOptionPane.showInputDialog("Cliente ou funcionário (c/f)? ");
            if (response.equals("f")) {
                String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionário: ");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário: "));
                Funcionario f = new Funcionario(cargo, salario, pf);
                empresa = new Empresa("Puc");
                empresa.addFuncionario(f);
            } else {
                double limiteCredito = Double.parseDouble(JOptionPane.showInputDialog("Digite o límite de crédito para o cliente: "));
                Cliente c = new Cliente(limiteCredito, pf);
                empresa = new Empresa("Puc");
                empresa.addCliente(c);
            }
        } else {
            String cnpj = JOptionPane.showInputDialog("Digite o cnpj: ");
            PessoaJuridica pj = new PessoaJuridica(nome, idade, sexo, cnpj);
            double limiteCredito = Double.parseDouble(JOptionPane.showInputDialog("Digite o límite de crédito para o cliente: "));
            Cliente c = new Cliente(limiteCredito, pj);
            empresa = new Empresa("Puc");
            empresa.addCliente(c);
        }


    }
}