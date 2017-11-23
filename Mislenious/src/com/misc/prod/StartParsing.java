package com.misc.prod;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class StartParsing {
	public static void main(String args[]) throws SQLException{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Intel processor parsing program.");
		System.out.println("Enter the URL:");
		String myint = keyboard.next();
		HashMap <String,String> processorDetails=new HashMap<String,String>();
		IntelXmlParser xmlparser=new IntelXmlParser();
		processorDetails=xmlparser.getProcessorList(myint);
		for(Entry<String, String> m:processorDetails.entrySet()){  
			   System.out.println(m.getKey()+" : "+m.getValue());  
		 	}
		
		myPostgresConn pgConn =new myPostgresConn();
		
		
		Integer counter=0;
		System.out.println("Save to DB (Y/N):");
		String dbSave = keyboard.next();
		pgConn.insertIntoDB(processorDetails);
		/*if(dbSave.equalsIgnoreCase("y")){
			for(Entry<String, String> m:processorDetails.entrySet()){ 
				pgConn.connect();
				pgConn.insertProcessorDetails(counter.toString(),m.getKey().toString(),m.getValue().toString()); 
				counter++;
			 	}
			//pgConn.insertProcessorDetails("520","7200","best234");
		}*/
		System.out.println("Sucess");
		//pgConn.testQuery();
		//System.out.println(pgConn.insertProcessorDetails("520","7200","best234"));
	}
}
