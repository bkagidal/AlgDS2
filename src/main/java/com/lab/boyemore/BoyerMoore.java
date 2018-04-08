package com.lab.boyemore;

import java.util.HashMap;
import java.util.Map;

public class BoyerMoore {

	private Map<Character, Integer> mismatchShiftsTable;
	private String pattern;
	private String text;

	public BoyerMoore(String text, String pattern) {
		this.text = text;
		this.pattern = pattern;
		this.mismatchShiftsTable = new HashMap<>();
	}

	public void preComputeShifts() {

		for (int i = 0; i < this.pattern.length(); i++) {

			char actualChar = pattern.charAt(i);
			int maxShift = Math.max(1, this.pattern.length() - i - 1);
			mismatchShiftsTable.put(actualChar, maxShift);

		}
	}

	public int search() {
		int lenTex = this.text.length();
		int lenPat = this.pattern.length();
		int numOfSkips;

		for (int i = 0; i <= lenTex - lenPat; i += numOfSkips) {
			
			numOfSkips = 0;
			
			for (int j = lenPat - 1; j >= 0;j--) {
				
				if (pattern.charAt(j) != this.text.charAt(i + j)) {
					
					if(this.mismatchShiftsTable.get(text.charAt(i+j)) != null){
						numOfSkips = this.mismatchShiftsTable.get(text.charAt(i+j));
						System.out.println(numOfSkips);
						break;
					}else{
						numOfSkips = lenPat;
						System.out.println(numOfSkips);
						break;
					}
				}
			}

			if (numOfSkips == 0)
				return i;

		}

		return lenTex;

	}

}
