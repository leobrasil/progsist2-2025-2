package mack.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class DAO {
    protected Connection con;

    protected Connection connect() throws Exception{
        if(this.con == null || !this.con.isClosed()){
            Class.forName("org.postgresql.Driver");
		    String url = "jdbc:postgresql://aws-1-sa-east-1.pooler.supabase.com:6543/postgres?user=postgres.rkqyusvxnhasqfkjmezn&password=tNZdpsLHFoAzMEfx";
		
            this.con = DriverManager.getConnection(url);
        }
        return this.con;
    }

    public Connection getCon(){
        return this.con;
    }

}
