package Questao_01;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel nomeLabel, sexoLabel, estCivilLabel, idadeLabel;
	private JTextField nome, sexo, estadoCivil, idade;
	private JButton butOK, butCancel;

	public Window() {
		super("Cadastro de pessoa");

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cPane = this.getContentPane();

		cPane.setLayout(new GridLayout(5, 2));

		this.addWindowListener(new AppListener());

		nomeLabel = new JLabel("Nome");
		sexoLabel = new JLabel("Sexo");
		estCivilLabel = new JLabel("Estado Civil");
		idadeLabel = new JLabel("Idade");

		nome = new JTextField(30);
		sexo = new JTextField(9);
		estadoCivil = new JTextField(10);
		idade = new JTextField(2);

		butOK = new JButton("OK");
		butCancel = new JButton("Cancelar");

		butOK.addActionListener(new ButOKEvent());
		butCancel.addActionListener(new ButCancelEvent());

		cPane.add(nomeLabel);
		cPane.add(nome);
		cPane.add(sexoLabel);
		cPane.add(sexo);
		cPane.add(estCivilLabel);
		cPane.add(estadoCivil);
		cPane.add(idadeLabel);
		cPane.add(idade);
		cPane.add(butOK);
		cPane.add(butCancel);

		/*
		 * butOK.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { } });
		 */
		/*
		 * butCancel.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { } });
		 */
		this.pack();

	}

	class ButOKEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Pessoa pessoa = new Pessoa(nome.getText(), sexo.getText(), estadoCivil.getText(), idade.getText());
			nome.setText("");
			sexo.setText("");
			estadoCivil.setText("");
			idade.setText("");

			JOptionPane.showMessageDialog(null, pessoa.toString(), "Cadastro realizado",
					JOptionPane.PLAIN_MESSAGE);
		}
	}

	class ButCancelEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			nome.setText("");
			sexo.setText("");
			estadoCivil.setText("");
			idade.setText("");
		}
	}

	private class AppListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
