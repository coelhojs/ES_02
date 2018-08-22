package EX_04;

import javax.swing.*;

public class ConversorApp {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();

        String resposta = JOptionPane.showInputDialog("Deseja converter pés para metros, polegadas ou centimetros?");

        switch (resposta) {
            case "metros":
                double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade em pés para a conversão: "));
                JOptionPane.showMessageDialog(null, "O resultado da conversão é: "
                        + conversor.converterPesParaMetros(quantidade));
                break;
            case "polegadas":
                quantidade = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade em pés para a conversão: "));
                JOptionPane.showMessageDialog(null, "O resultado da conversão é: "
                        + conversor.converterPesParaPolegadas(quantidade));
                break;
            case "centimetros":
                quantidade = Double.parseDouble(JOptionPane.showInputDialog("Entre com a quantidade em pés para a conversão: "));
                JOptionPane.showMessageDialog(null, "O resultado da conversão é: "
                        + conversor.converterPesParaCentimetros(quantidade));
        }
    }
}


