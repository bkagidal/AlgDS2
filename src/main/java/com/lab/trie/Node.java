package com.lab.trie;

public class Node {

	private String character;
	private Node[] childNodes;
	private boolean leaf;
	private boolean visited;
	private int value;
	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public Node[] getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(Node[] childNodes) {
		this.childNodes = childNodes;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Node(String character) {
		this.character = character;
		childNodes = new Node[Constants.ALPHABET_SIZE];
	}

	public void setChild(int index, Node node) {
		childNodes[index] = node;
	}
	
	public void setChild(int index, Node node,int value) {
		node.setValue(value);
		childNodes[index] = node;
	}
	
	public Node getChild(int index) {
		return childNodes[index];
	}
	
	@Override
	public String toString() {
		return this.character;
	}
}
