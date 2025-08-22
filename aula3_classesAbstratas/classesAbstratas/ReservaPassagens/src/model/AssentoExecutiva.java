package model;

public class AssentoExecutiva extends Assento{
    private double acrecimo = 0.3;

    public AssentoExecutiva(String classe, double precoBase) {
        super(classe, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.getPrecoBase() + (this.getPrecoBase() * this.acrecimo);
    }

}
