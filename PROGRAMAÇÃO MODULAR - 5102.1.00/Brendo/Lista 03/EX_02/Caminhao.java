package EX_02;

public class Caminhao extends Carro {

    private int carga;

    public Caminhao(int velocidade, double preco, String cor, int carga) {
        super(velocidade, preco, cor);
        this.carga = carga;
    }

    public Caminhao() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double getPrecoVenda() {
        if (getCarga() > 2000) {
           return getPreco() - (getPreco() * 0.10);
        } else {
            return getPreco() - (getPreco() * 0.20);
        }
    }

    @Override
    public String toString() {
        return "velocidade=" + super.getVelocidade() +
                ", preco=" + getPrecoVenda() +
                ", cor=" + super.getCor() +
                ", carga=" + getCarga() + " KG";
    }
}
