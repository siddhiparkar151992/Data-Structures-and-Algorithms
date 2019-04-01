package main.java.amazon;

public class HuffmanNode {
	public String data;
	public int freq;
	public HuffmanNode left;
	public HuffmanNode right;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}
	public HuffmanNode getLeft() {
		return left;
	}
	public void setLeft(HuffmanNode left) {
		this.left = left;
	}
	public HuffmanNode getRight() {
		return right;
	}
	public void setRight(HuffmanNode right) {
		this.right = right;
	}
	
	
}
