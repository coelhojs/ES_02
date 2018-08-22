package EX_02;

import javax.swing.*;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
        pessoa.setNome(nome);
        String cpf = JOptionPane.showInputDialog("Digite o número do cpf: ");
        pessoa.setCpf(cpf);
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));
        pessoa.setIdade(idade);
        String sexo = JOptionPane.showInputDialog("Digite o sexo da pessoa: ");
        pessoa.setSexo(sexo);

        JOptionPane.showMessageDialog(null,"O nome da pessoa é: " + pessoa.getNome() + " | "
                + " O número do cpf da pessoa é: " + pessoa.getCpf() + " | " + " A idade da pessoa é: " + pessoa.getIdade()
                + " | " + " O sexo da pessoa é: " + pessoa.getSexo());

        if (pessoa.isMaiorIdade() == true){
            JOptionPane.showMessageDialog(null, "A pessoa é maior de idade!");
        } else {
            JOptionPane.showMessageDialog(null, "A pessoa não é maior de idade!");
        }

    }
}
