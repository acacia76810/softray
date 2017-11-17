package com.misc;

import java.io.File;
import java.io.IOException;

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
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	Elements content = doc.getElementsByClass("specs-list");
	//Elements links = content.className("span");
	System.out.println(doc.title());
	//Elements links =  content.getElementsByTag("span");
	//System.out.println(content.attr("span"));
	//System.out.println(content.text());
	for (Element link : content) {
		System.out.println("MYTAG"+link.tagName("span").text());
		//System.out.println("MYTAG"+ linkText);
	  //String linkText = link.text();
	  //System.out.println(linkText);
	}
	
	}
}
