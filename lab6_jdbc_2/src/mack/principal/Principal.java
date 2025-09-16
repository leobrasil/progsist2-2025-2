package mack.principal;

import java.util.List;

import mack.dao.DAOProprietario;
import mack.model.Proprietario;

public class Principal {

    public static void main(String args[]){
        Proprietario p = new Proprietario(0L,"Neymar","12346578");
        DAOProprietario daoProp = new DAOProprietario();

        daoProp.create(p);

        List<Proprietario> lista = daoProp.getAllProprietarios();

        for (Proprietario proprietario : lista) {
            System.out.println(proprietario.getNome());
        }
    }

}
