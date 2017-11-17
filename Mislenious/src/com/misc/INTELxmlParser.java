package com.misc;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class INTELxmlParser {
	public static void main(String args[]){
		try {
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		    
		    
		    URL oracle = new URL("https://ark.intel.com/products/126686/Intel-Core-i7-8700-Processor-12M-Cache-up-to-4_60-GHz");
	        URLConnection yc = oracle.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	                                yc.getInputStream()));
	        //String XString = in.readLine().toString();
		    //XString = XString.replaceAll("[^\\x20-\\x7e]", "");
		    //Document doc = docBuilder.parse (in.readLine());
		   // doc.getDocumentElement().normalize();
		    
		    //System.out.println ("Root element of the doc is " + in.readLine());
		    
		    String inputLine;
		    PrintWriter writer1 =null;  
		    writer1 = new PrintWriter(new File("D:\\testou2t.txt"));  
			while ((inputLine = in.readLine()) != null) {
				//Document doc = docBuilder.parse (inputLine);
				 //doc.getDocumentElement().normalize();
				    
				//System.out.println (inputLine);
				
				//PrintWriter out = new PrintWriter(new OutputStreamWriter(
				//	      new BufferedOutputStream(new FileOutputStream("c:\\tmp\\myout.txt")), "UTF-8"));
				
				writer1.append(inputLine);
				writer1.println();
		                                                            
		                        
			}
			
	         //writer1.write(inputLine);
			 writer1.flush();  
	         writer1.close();  
	         System.out.println ("Sucess");
		    
		    
		    
			
		}
		
		catch (Exception err) {
		   
		    err.printStackTrace ();
		}
	}
}
