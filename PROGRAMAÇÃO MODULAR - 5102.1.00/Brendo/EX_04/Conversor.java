package EX_04;

public class Conversor {

    private double pes;
    private double metros;
    private double polegadas;
    private double centimetros;

    public Conversor(double pes, double metros, double polegadas, double centimetros) {
        this.pes = pes;
        this.metros = metros;
        this.polegadas = polegadas;
        this.centimetros = centimetros;
    }

    Conversor() {
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(double polegadas) {
        this.polegadas = polegadas;
    }

    public double getCentimetros() {
        return centimetros;
    }

    public void setCentimetros(double centimetros) {
        this.centimetros = centimetros;
    }

    public double converterPesParaMetros(double pes) {
        metros = pes * 0.3048;

        return metros;
    }

    double converterPesParaPolegadas(double pes) {
        polegadas = pes * 12000;

        return polegadas;
    }

    double converterPesParaCentimetros(double pes) {
        centimetros = pes * 0.032808;

        return centimetros;
    }

    double converterPolegadasParaMetros(double polegadas) {
        metros = polegadas * 0.0254;

        return metros;
    }

    double converterPolegadasParaPes(double polegadas) {
        pes = polegadas * 0.083333;

        return pes;
    }

    double converterPolegadasParaCentimetros(double polegadas) {
        centimetros = polegadas / 0.39370;
        return centimetros;
    }

    double converterMetrosParaPes(double metros) {
        pes = metros * 3.2808;

        return pes;
    }

    double converterMetrosParaPolegadas(double metros) {
        polegadas = metros * 39.370;

        return polegadas;
    }

    double converterMetrosParaCentimetros(double metros) {
        centimetros = metros / 0.010000;

        return centimetros;
    }

    double converterCentimetrosParaPes(double centimetros) {
        pes = centimetros * 0.032808;

        return pes;

    }

    double converterCentimetrosParaPolegadas(double centimetros) {
        polegadas = centimetros * 0.39370;

        return polegadas;

    }

    double converterCentimetrosParaMetros(double centimetros) {
        metros = centimetros / 100.00;

        return metros;
    }

}
