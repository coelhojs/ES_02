
public class Data {
	public Data(int ano, int mes, int dia);

	public Data(); // hoje

	public int getDia(), getMes(), getAno();

	public void adicionaDias(int dias); // avanca a data em dias

	public int diasNoMes();

	public String diaDaSemana(); // ex . " Segunda−f e i r a "

	public boolean equals(Object o);

	public boolean eAnoBisexto();

	public void proximoDia(); // avanca um dia

	public String toString();
}
