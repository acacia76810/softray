package com.misc;

public class ProcessorTag {
	public boolean isProcessorTag(String tagName){
		if(tagName == "inputLine"||tagName == "CoreCount"||tagName == "ThreadCount" ){
			return true;
		}else
			return false;
		
	}
}
