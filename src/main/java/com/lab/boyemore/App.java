package com.lab.boyemore;

public class App {
	
public static void main(String[] args) {
		
		String text = "This is a test";
		String pattern = "test";
		
		BoyerMoore boyerMoore = new BoyerMoore(text, pattern);
		boyerMoore.preComputeShifts();
		System.out.println( boyerMoore.search() );

	}

}