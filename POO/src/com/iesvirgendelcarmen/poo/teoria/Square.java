package com.iesvirgendelcarmen.poo.teoria;

public class Square{
	private int side;

	public int getSide() {
		return side;
	}
	
	public Square() {
		this.side = 5;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	
	
	

}
