import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://db.rkqyusvxnhasqfkjmezn.supabase.co:5432/postgres";


            String username="postgres";
			String password="tNZdpsLHFoAzMEfx";

			Connection con = DriverManager.getConnection("jdbc:postgresql://aws-1-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.rkqyusvxnhasqfkjmezn&password=tNZdpsLHFoAzMEfx");

            Statement stmt = con.createStatement();

            //Consultando
            ResultSet rs = stmt.executeQuery("SELECT * FROM PROPRIETARIOS");

            while(rs.next()){
                System.out.println(rs.getString("ID"));
            }

            //inserindo
            String sql_insert = "INSERT INTO PROPRIETARIOS (NOME, CPF) VALUES(?,?)";

            PreparedStatement pstmt = con.prepareStatement(sql_insert);

            pstmt.setString(1,  "antonio");
            pstmt.setString(2,"333333333-33");

            int qte = pstmt.executeUpdate();
            if(qte >=1)
                System.out.println("inserido com sucesso");

    }
}