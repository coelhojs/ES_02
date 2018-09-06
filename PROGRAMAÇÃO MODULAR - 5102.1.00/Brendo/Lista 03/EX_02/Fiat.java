package EX_02;

public class Fiat extends Carro {

    private int descontoDeFabrica;

    public Fiat(int velocidade, double preco, String cor, int descontoDeFabrica) {
        super(velocidade, preco, cor);
        this.descontoDeFabrica = descontoDeFabrica;
    }

    public Fiat() {
    }

    @Override
    public double getPrecoVenda() {
        return super.getPreco() - descontoDeFabrica;
    }

    @Override
    public String toString() {
        return "velocidade=" + super.getVelocidade() +
                ", preco=" + getPrecoVenda() +
                ", cor=" + super.getCor();
    }
}
