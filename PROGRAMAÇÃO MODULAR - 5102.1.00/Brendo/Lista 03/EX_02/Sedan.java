package EX_02;

public class Sedan extends Carro{

    private int comprimento;

    public Sedan(int velocidade, double preco, String cor, int comprimento) {
        super(velocidade, preco, cor);
        this.comprimento = comprimento;
    }

    public Sedan() {
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double getPrecoVenda() {
        if (comprimento > 6) {
            return getPreco() - (getPreco() * 0.05);
        } else {
            return getPreco() - (getPreco() * 0.10);
        }
    }

    @Override
    public String toString() {
        return "velocidade=" + super.getVelocidade() +
                ", preco=" + getPrecoVenda() +
                ", cor=" + super.getCor() +
                ", comprimento=" + getComprimento();
    }
}
