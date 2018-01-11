package com.iesvirgendelcarmen.poo.teoria;

public class Rectangle {
	//atributos o variables de instancia
	private int height;
	private int width;
	
	//getters y setters
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getArea() {
		return height * width;
	}
	
	public int getPerimeter() {
		return (height + width) * 2;
	}
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", Area=" + getArea() + ", Perimeter="
				+ getPerimeter() + "]";
	}
	
	
	
	
	
}