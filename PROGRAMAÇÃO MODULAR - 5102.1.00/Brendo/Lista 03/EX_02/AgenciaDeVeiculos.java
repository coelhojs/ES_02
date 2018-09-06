package EX_02;

import javax.swing.*;

public class AgenciaDeVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro(180, 15000.00, "Vermelho");
        JOptionPane.showMessageDialog(null, carro, "Carro", JOptionPane.PLAIN_MESSAGE);

        Caminhao caminhao = new Caminhao(110, 300000.00, "Branco", 3000);
        JOptionPane.showMessageDialog(null, caminhao, "Caminhão", JOptionPane.PLAIN_MESSAGE);

        Fiat fiat = new Fiat(180, 30000.00, "Amarelo", 3000);
        JOptionPane.showMessageDialog(null, fiat, "Fiat", JOptionPane.PLAIN_MESSAGE);

        Sedan sedan = new Sedan(220, 50000.00, "Roxo", 7);
        JOptionPane.showMessageDialog(null, sedan, "Sedan", JOptionPane.PLAIN_MESSAGE);
    }
}
