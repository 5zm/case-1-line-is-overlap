package com.example.training;

public class Line {

	private int p1;
	private int p2;
	
	public Line() {
		
	}

	public Line(int p1, int p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Line [p1=");
		builder.append(p1);
		builder.append(", p2=");
		builder.append(p2);
		builder.append("]");
		return builder.toString();
	}	
}
