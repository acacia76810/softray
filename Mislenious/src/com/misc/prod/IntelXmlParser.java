package com.misc.prod;

import java.util.HashMap;
import java.util.Map.Entry;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class IntelXmlParser {
	public HashMap<String,String> getProcessorList(String URL){
		Document doc = null;
		try {
			//doc = Jsoup.parse(URLdata);
			doc = Jsoup.connect(URL).get();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		int mycounter=0;
		
		Elements specsList=doc.getElementsByClass("specs-list");
		
		HashMap<String,String> processordDetails =new HashMap<String,String>();
		for (Element link : specsList.select("li")) {
			//processordDetails.put(name.tagName("span").text(), value.tagName("span").text());
			String name_=link.select(".label span").text();
			//System.out.println("Name:"+name_);
			String value_=link.select(".value span").text();
			//System.out.println("Value:"+value_);	
			processordDetails.put(name_, value_);
			//System.out.println("CLASS : "+link.className());
			mycounter++;
			//System.out.println("**************************************");
		}
		
	 	/*for(Entry<String, String> m:processordDetails.entrySet()){  
		   System.out.println(m.getKey()+" : "+m.getValue());  
	 	}*/
		System.out.println("Count :"+mycounter);
		System.out.println("Map:"+processordDetails.size());
		return processordDetails;
		
	}
}
