package model;

public abstract class Assento {
    private String classe;
    private double precoBase;

    public Assento(String classe, double precoBase){
        this.classe=classe;
        this.precoBase=precoBase;
    }

    public abstract double calcularPrecoFinal();

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

   

}
