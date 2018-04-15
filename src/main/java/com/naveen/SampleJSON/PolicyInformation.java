package com.naveen.SampleJSON;

public class PolicyInformation {

	String product;
	String line;
	String comments;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "PolicyInformation [product=" + product + ", line=" + line
				+ ", comments=" + comments + "]";
	}
}
