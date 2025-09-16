import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
       try{
        Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://aws-1-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.rkqyusvxnhasqfkjmezn&password=tNZdpsLHFoAzMEfx";
		
        Connection con = DriverManager.getConnection(url);

        Statement stmt = con.createStatement();

            //Consultando
        ResultSet rs = stmt.executeQuery("SELECT * FROM PROPRIETARIOS");

            while(rs.next()){
                System.out.println(rs.getString("ID"));
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("cpf"));
            }

            //inserindo
            String sql_insert = "INSERT INTO PROPRIETARIOS (NOME, CPF) VALUES(?,?)";

            PreparedStatement pstmt = con.prepareStatement(sql_insert);

            pstmt.setString(1,  "Carlos");
            //pstmt.setString("NOME",  "Carlos");
            pstmt.setString(2,"333333333-33");

            int qte = pstmt.executeUpdate();
            if(qte >=1)
                System.out.println("inserido com sucesso");





       }catch(Exception ex){
            ex.printStackTrace();
       }





    }
}
