package EX_02;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class DataApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Data date = new Data(2018, 10, 13);
        Data date2 = new Data(2018, 10, 13);

        System.out.println(date.equals(date2));

        System.out.printf("A data atual é: %d/%d/%d", date.getDia(), date.getMes(), date.getAno());

        int diasAdd = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias a adicionar: "));
        date.adicionaDias(diasAdd);
        System.out.println();
        System.out.printf("A data atual é: %d/%d/%d", date.getDia(), date.getMes(), date.getAno());
        System.out.println();
        System.out.println("O dia da semana é: " + date.diaDaSemana());
        date.proximoDia();
        System.out.println();
        System.out.printf("A data atual é: %d/%d/%d", date.getDia(), date.getMes(), date.getAno());

        System.out.println();
        System.out.println(date);

    }

}