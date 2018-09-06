package EX_02;

public class Carro {
    private int velocidade;
    private double preco;
    private String cor;

    public Carro(int velocidade, double preco, String cor) {
        this.velocidade = velocidade;
        this.preco = preco;
        this.cor = cor;
    }

    public Carro() {
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoVenda() {
        return getPreco();
    }

    @Override
    public String toString() {
        return "velocidade=" + velocidade +
                ", preco=" + preco +
                ", cor='" + cor + '\'';
    }
}
