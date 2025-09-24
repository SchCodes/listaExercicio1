package restaurante;

public class Balanca {
    private double taraPrato;     // em gramas
    private double pesoTotal;     // em gramas (prato + comida)
    private double valorKg;       // em reais

    // Construtor
    public Balanca(double taraPrato, double pesoTotal, double valorKg) {
        this.taraPrato = taraPrato;
        this.pesoTotal = pesoTotal;
        this.valorKg = valorKg;
    }

    // Getters e Setters
    public double getTaraPrato() {
        return taraPrato;
    }

    public void setTaraPrato(double taraPrato) {
        this.taraPrato = taraPrato;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public double getValorKg() {
        return valorKg;
    }

    public void setValorKg(double valorKg) {
        this.valorKg = valorKg;
    }

    // (a) Valor cobrado por quilograma
    public double mostrarValorKg() {
        return valorKg;
    }

    // (b) Peso do alimento (em gramas, descontando tara)
    public double calcularPesoAlimento() {
        return pesoTotal - taraPrato;
    }

    // (c) Valor do prato em reais
    public double calcularValorPrato() {
        double pesoKg = calcularPesoAlimento() / 1000.0; // converte para kg
        return pesoKg * valorKg;
    }
}
