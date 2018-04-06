package com.lab.trie;

public class App {
	
	public static void main(String[] args) {
		
		Trie tree = new Trie();
		
		//tree.insert("bala",1);
		//tree.insert("manu",2);
		tree.insert("balar",3);
		tree.insert("raju",4);
		tree.insert("raju",4);
		tree.insert("raj",5);
		tree.insert("rajmu",6);
		//System.out.println(tree.allWordWithPrefix("")); // Sort
		//System.out.println(tree.allWordWithPrefix("ba")); // autocomplete
		
		System.out.println(tree.longestCommenPrefix());
		
	}

}
