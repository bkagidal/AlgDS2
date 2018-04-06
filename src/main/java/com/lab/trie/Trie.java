package com.lab.trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {

	private Node root;
	private int sigleChldIndex;

	public Trie() {
		this.root = new Node("");
	}

	public void insert(String key) {

		Node tempNode = root;

		for (int i = 0; i < key.length(); i++) {

			char c = key.charAt(i);

			int asciiIndex = c - 'a';

			if (tempNode.getChild(asciiIndex) == null) {
				Node node = new Node(String.valueOf(c));
				tempNode.setChild(asciiIndex, node);
				tempNode = node;
			} else
				tempNode = tempNode.getChild(asciiIndex);
		}

		tempNode.setLeaf(true);

	}

	public void insert(String key, int value) {

		Node tempNode = root;

		for (int i = 0; i < key.length(); i++) {

			char c = key.charAt(i);

			int asciiIndex = c - 'a';

			if (tempNode.getChild(asciiIndex) == null) {
				Node node = new Node(String.valueOf(c));
				tempNode.setChild(asciiIndex, node, value);
				tempNode = node;
			} else
				tempNode = tempNode.getChild(asciiIndex);
		}

		tempNode.setLeaf(true);

	}

	public boolean Search(String key) {

		Node tempNode = root;

		for (int i = 0; i < key.length(); i++) {

			char c = key.charAt(i);
			int asciiIndex = c - 'a';

			if (tempNode.getChild(asciiIndex) == null)
				return false;
			else
				tempNode = tempNode.getChild(asciiIndex);

		}

		return true;

	}

	public Integer SearchMap(String key) {

		Node tempNode = root;

		for (int i = 0; i < key.length(); i++) {

			char c = key.charAt(i);
			int asciiIndex = c - 'a';

			if (tempNode.getChild(asciiIndex) != null)
				tempNode = tempNode.getChild(asciiIndex);
			else
				return null;

		}

		if (!tempNode.isLeaf())
			return null;

		return tempNode.getValue();

	}

	public List<String> allWordWithPrefix(String pre) {

		Node tempNode = root;
		List<String> allwords = new ArrayList<>();

		for (int i = 0; i < pre.length(); i++) {
			char c = pre.charAt(i);
			int ascii = c - 'a';
			tempNode = tempNode.getChild(ascii);
		}

		collect(tempNode, pre, allwords);

		return allwords;
	}

	private void collect(Node node, String pre, List<String> allwords) {

		if (node == null)
			return;

		if (node.isLeaf())
			allwords.add(pre);

		for (Node childNode : node.getChildNodes()) {
			if (childNode == null)
				continue;
			String str = childNode.getCharacter();
			collect(childNode, pre + str, allwords);

		}
	}

	public String longestCommenPrefix() {

		Node tempNode = root;
		String lcp = "";

		while (CountNoOfChildren(tempNode) == 1 && !tempNode.isLeaf()) {
			tempNode = tempNode.getChild(sigleChldIndex);
			lcp = lcp + String.valueOf((char)(sigleChldIndex + 'a'));
		}
		return lcp;
	}

	private int CountNoOfChildren(Node node) {

		int noofchilds = 0;

		for (int i = 0; i < node.getChildNodes().length; i++) {
			if (node.getChild(i) != null) {
				noofchilds++;
				sigleChldIndex = i;
			}
		}
		return noofchilds;
	}

}
