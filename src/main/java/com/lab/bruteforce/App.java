package com.lab.bruteforce;

public class App {

	public static void main(String[] args) {

		String text = "Hi Bala How Are you";
		String pattern = "ow";

		System.out.println(search(text, pattern));
	}

	private static int search(String text, String pattern) {

		int lenTxt = text.length();
		int lenPat = pattern.length();

		for (int i = 0; i <= lenTxt - lenPat; i++) {

			int j;

			for (j = 0; j < lenPat; j++) {
				if (pattern.charAt(j) != text.charAt(i + j))
					break;
			}

			if (j == lenPat)
				return i;
		}

		return lenTxt;

	}

}
