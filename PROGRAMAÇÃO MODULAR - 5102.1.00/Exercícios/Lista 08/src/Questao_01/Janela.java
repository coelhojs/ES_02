package Questao_01;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {
	private JButton butOK, butCancel;
	private JTextField nome, sexo, estadoCivil, idade;
	private JLabel nomeLabel, sexoLabel, estCivilLabel, idadeLabel;

	public Janela() {
		super("Cadastro de pessoa");
		
		Container cPane = this.getContentPane();
	}
	
}
