package com.misc.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class myPostgresConn {
	private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "Amit@1234";
 
    Connection conn = null;
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
    public String testQuery() throws SQLException{
    	Statement st = conn.createStatement();
    	ResultSet rs = st.executeQuery("SELECT * FROM sample");
    	while (rs.next())
    	{
    	    System.out.print("Column 1 returned ");
    	    System.out.println(rs.getString(1));
    	}
    	rs.close();
    	st.close();
		return password;
    }
    
    public static void main(String[] args) throws SQLException {
    	myPostgresConn app = new myPostgresConn();
        app.connect();
        app.testQuery();
    }
}
