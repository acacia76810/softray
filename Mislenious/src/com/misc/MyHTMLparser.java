package com.misc;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MyHTMLparser {
	public static void main(String args[]) throws IOException{
	File input = new File("D:\\testou2t.txt");
	Document doc = null;
	try {
		doc = Jsoup.parse(input, "UTF-8", "https://ark.intel.com/products/126686/Intel-Core-i7-8700-Processor-12M-Cache-up-to-4_60-GHz");
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	int mycounter=0;
	
	Elements specsList=doc.getElementsByClass("specs-list");
	
	HashMap<String,String> processordDetails =new HashMap<String,String>();
	for (Element link : specsList.select("li")) {
		//processordDetails.put(name.tagName("span").text(), value.tagName("span").text());
		String name_=link.select(".label span").text();
		System.out.println("Name:"+name_);
		String value_=link.select(".value span").text();
		System.out.println("Value:"+value_);	
		processordDetails.put(name_, value_);
		System.out.println("CLASS : "+link.className());
		mycounter++;
		System.out.println("**************************************");
	}
	
 	for(Entry<String, String> m:processordDetails.entrySet()){  
	   System.out.println(m.getKey()+" \t\t"+m.getValue());  
 	}
	System.out.println("Count :"+mycounter);
	System.out.println("Map:"+processordDetails.size());
	}
}
