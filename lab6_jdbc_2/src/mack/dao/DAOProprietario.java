package mack.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mack.model.Proprietario;

public class DAOProprietario extends DAO{

    public void create(Proprietario p){

        try {
            String sql = "INSERT INTO PROPRIETARIOS (NOME, CPF) VALUES(?,?)";
            PreparedStatement pstmt = super.connect().prepareStatement(sql);
            pstmt.setString(1, p.getNome());
            pstmt.setString(2, p.getCpf());
            int qte = pstmt.executeUpdate();
            if(qte >=1)
                System.out.println("inserido com sucesso");

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public List<Proprietario> getAllProprietarios(){
        List<Proprietario> resultList = new ArrayList<>();
        try {
            Statement stmt = super.connect().createStatement();

            //Consultando
            ResultSet rs = stmt.executeQuery("SELECT * FROM PROPRIETARIOS");

            while(rs.next()){
                Proprietario aux = new Proprietario(rs.getLong("ID"), rs.getString("nome"),rs.getString("cpf"));
               resultList.add(aux);
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultList;
    }

}
