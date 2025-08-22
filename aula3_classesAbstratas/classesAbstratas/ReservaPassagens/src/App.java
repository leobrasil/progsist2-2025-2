import model.Assento;
import model.AssentoEconomica;
import model.AssentoExecutiva;
import model.Passageiro;

public class App {
    public static void main(String[] args) {
        Assento a1 = new AssentoEconomica("Economica", 50.0);
        //System.out.println("Valor do Assento: "+ a1.calcularPrecoFinal());

        Assento a2 = new AssentoExecutiva("Economica", 50.0);
        //System.out.println("Valor do Assento: "+ a2.calcularPrecoFinal()); 

        Passageiro p1 = new Passageiro("Carlos");
        System.out.println("comprando assento na classe economica");
        p1.setAssento(a1);

        System.out.println("O Assento do Passageiro ["+p1.getNome()+"] custa [R$"+p1.getAssento().calcularPrecoFinal()+"]");

        System.out.println("realizando o upgrade");
        p1.setAssento(a2);
        System.out.println("O Assento do Passageiro ["+p1.getNome()+"] custa [R$"+p1.getAssento().calcularPrecoFinal()+"]");

    }
}
