package com.lab.strings;

import java.util.List;

public class App {
	
	public static void main(String[] args) {
		StringOperations operations = new StringOperations();
		
		//System.out.println(operations.revertString("Hello Bala"));
		
		/*List<String> suffix = operations.getSuffixes("Hello");
		
		for(String s:suffix)
			System.out.println(s);*/
		
		List<String> prefixList = operations.getPrefixes("Hello");
		
		for(String s:prefixList)
			System.out.println(s);
	}

}
