package com.misc.prod;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class StartParsing {
	public static void main(String args[]) throws SQLException{
		/*Scanner keyboard = new Scanner(System.in);
		System.out.println("Intel processor parsing program.");
		System.out.println("Enter the URL:");
		String myint = keyboard.next();
		HashMap <String,String> processorDetails=new HashMap<String,String>();
		IntelXmlParser xmlparser=new IntelXmlParser();
		processorDetails=xmlparser.getProcessorList(myint);
		for(Entry<String, String> m:processorDetails.entrySet()){  
			   System.out.println(m.getKey()+" : "+m.getValue());  
		 	}
		/*System.out.println("Save to DB (Y/N):");
		String dbSave = keyboard.next();
		if(dbSave.equalsIgnoreCase("y")){
			
		}*/
		myPostgresConn pgConn =new myPostgresConn();
		pgConn.connect();
		//pgConn.testQuery();
		System.out.println(pgConn.insertProcessorDetails("520","7200","best234"));
	}
}
