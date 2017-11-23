package com.misc.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;

public class myPostgresConn {
	private final String url = "jdbc:postgresql://localhost:5432/amit";
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
    	ResultSet rs = st.executeQuery("INSERT INTO sample(id, name, city)VALUES (411, 'Jony', 'lokhanwala');");
    	while (rs.next())
    	{
    	    System.out.print("Column 1 returned ");
    	    System.out.println(rs.getString(1));
    	}
    	rs.close();
    	st.close();
		return null;
    }
    public void insertProcessorDetails(String id, String name, String value) throws SQLException{
    	System.out.println(id +" - "+name+" - "+value);
    	
    	Statement st = conn.createStatement();
    	//String quote=;
    	ResultSet rs = st.executeQuery("INSERT INTO intelprocessordetails(id, name, value)VALUES ('"+id+"', '"+name+"', '"+value+"');");
    			//INSERT INTO public.IntelProcessorDetails(id, name, value)VALUES ("+id+", "+name+", "+value);
    	while (rs.next())
    	{
    	    System.out.print("Column 1 returned");
    	    System.out.println(rs.getString(1));
    	}
    	rs.close();
    	st.close();
    	//return "true";
    }
    public void insertIntoDB(HashMap<String,String> mp) throws SQLException{

    	
    	Statement st = conn.createStatement();
    	ResultSet rs=null;
    	for(Entry<String, String> m:mp.entrySet()){ 
    		String name=m.getKey().toString();
    		String value=m.getValue().toString();
    		 rs = st.executeQuery("INSERT INTO intelprocessordetails(id, name, value)VALUES (,"+name+", '"+value+"');");
			//pgConn.insertProcessorDetails(m.getKey().toString(),m.getValue().toString()); 
		
		 	}
    	
    	
    	
    			
    	
    	rs.close();
    	st.close();
    }
    
    public static void main(String[] args) throws SQLException {
    	myPostgresConn app = new myPostgresConn();
        app.connect();
        //app.testQuery();
    	//System.out.println(app.insertProcessorDetails("e520", "e7200", "best"));
    	//System.out.println(app.testQuery());
    }
}
