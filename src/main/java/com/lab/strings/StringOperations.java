package com.lab.strings;

import java.util.ArrayList;
import java.util.List;

import sun.print.PeekGraphics;

public class StringOperations {

	public String revertString(String text) {

		int strLength = text.length();

		StringBuffer strBuilder = new StringBuffer();

		for (int index = strLength - 1; index >= 0; index--)
			strBuilder.append(text.charAt(index));

		return strBuilder.toString();
	}

	public List<String> getSuffixes(String text) {

		int txtLength = text.length();

		List<String> suffixes = new ArrayList<>();

		for (int index = 0; index < txtLength; index++)
			suffixes.add(text.substring(index, txtLength));

		return suffixes;
	}

	public List<String> getPrefixes(String text) {

		int txtLength = text.length();

		List<String> prefixes = new ArrayList<>();

		for (int index = 1; index < txtLength + 1; index++)
			prefixes.add(text.substring(0, index));

		return prefixes;
	}

}
