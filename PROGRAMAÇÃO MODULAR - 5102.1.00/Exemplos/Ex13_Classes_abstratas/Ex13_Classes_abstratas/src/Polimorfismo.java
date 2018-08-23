import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Polimorfismo extends Applet {
	ListaDeFiguras lf;
	Button inserir;

	public Polimorfismo() throws HeadlessException {
		super();

		lf = new ListaDeFiguras(100);

		inserir = new Button("Inserir");
		this.setLayout(new BorderLayout());
		this.add(inserir, BorderLayout.SOUTH);

		inserir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Circulo c = new Circulo((int) Math.round((Math.random() * 150)),
						                (int) Math.round((Math.random() * 150)), 
						                (int) Math.round((Math.random() * 40)),
						           new Color((int) Math.round((Math.random() * 254)), 
							                 (int) Math.round((Math.random() * 254)),
								             (int) Math.round((Math.random() * 254))));
				c.setPreenchido(true);
				lf.insere(c);
				repaint();
			}
		});
	}

	public void init() {
		lf.insere(new Quadrado(0, 0, 30, Color.CYAN));
		lf.insere(new Quadrado(100, 100, 80, new Color(255, 30, 120)));
		lf.insere(new Circulo(20, 40, 34, Color.GREEN));
		repaint();
	}

	public void paint(Graphics g) {
		lf.desenha(g);
	}
}
