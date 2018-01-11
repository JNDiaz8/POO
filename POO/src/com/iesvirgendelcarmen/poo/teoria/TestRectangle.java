package com.iesvirgendelcarmen.poo.teoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestRectangle {

	private static Rectangle maxRectangle;


	public static void main(String[] args) {
		
		System.out.println("Set height and width of the rectangle");
		Scanner in = new Scanner(System.in);
		int width  = in.nextInt();
		int height = in.nextInt();
		in.close();
		
		//Creamos un objeto rectangulo
		Rectangle rectangle1 = new Rectangle();
		
		//inicializamos los atributos
		rectangle1.setHeight(height);
		rectangle1.setWidth(width);
		
		//Calculamos datos del rectángulo
		int area      = rectangle1.getArea();
		int perimeter = rectangle1.getPerimeter();
		
		//Mostramos los datos
		System.out.printf("The rectangle with height %d and width %d has an area value"
				+ " %d and perimeter value %d%n%n%n", 
				rectangle1.getHeight(), rectangle1.getWidth(), area, perimeter);
		
		 //llamamos a toString()
		
		//Creamos dos nuevos objetos Rectangulo
		Rectangle rectangle2 = new Rectangle();
		Rectangle rectangle3 = new Rectangle();
		rectangle2.setHeight(50);
		rectangle2.setWidth(25);
		rectangle3.setHeight(15);
		rectangle3.setWidth(10);
		
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println(rectangle3);
		
		//Creamos dos colecciones  de rectangulos (array y arralist)
		//array
		//int[] coleccionEnteros = new int[5];
		Rectangle[] arrayRectangles = new Rectangle[3];
		arrayRectangles[0] = rectangle1;
		arrayRectangles[1] = rectangle2;
		arrayRectangles[2] = rectangle3;
		
		//arraylist
		ArrayList<Rectangle> rectangleList = new ArrayList<>(); 
		rectangleList.add(rectangle3);
		rectangleList.add(rectangle2);
		rectangleList.add(rectangle1);
		
		//imprimimos las listas
		System.out.println(Arrays.toString(arrayRectangles));
		System.out.println(rectangleList);
		
		//llamamos a los métodos
		System.out.printf("Average areas is %.2f%n", getAverageAreas(arrayRectangles));
	
	}
	
	//método que pasamos una colección (array) de objetos Rectangulo y nos devuelva el 
	//valor medio de las áreas
	public static double getAverageAreas(Rectangle[] arrayRectangles) {
		double sum = 0;
		/*for (int i = 0; i < arrayRectangles.length; i++) {
			sum += arrayRectangles[i].getArea();
		}*/
		for (Rectangle rectangle : arrayRectangles) {
			sum += rectangle.getArea();
		}
		return sum / arrayRectangles.length;
	}
	//método que pasamos una colección (arrayList) de objetos Rectangulo y nos devuelva el 
	//valor medio de loa perímetros	
	public static double getAveragePerimeter(ArrayList<Rectangle> rectangleList) {
		double sum = 0;
		for (Rectangle rectangle : rectangleList) {
			sum += rectangle.getPerimeter();
		}
		
		return sum / rectangleList.size();
	}
		
	
	//método que nos devuelva un OBJETO RECTANGLE que tenga la mayor área
	public static Rectangle getMaxArea(ArrayList<Rectangle> rectangleList) {
		maxRectangle = rectangleList.get(0);
		int maxArea = rectangleList.get(0) .getArea();
		for (int i= 0; i < rectangleList.size(); i++)
			if(rectangleList.get(i).getArea() > maxArea) {
				maxRectangle = rectangleList.get(i);
				maxArea = rectangleList.get(i).getArea();
				
			}
		
		return null;
		
	}

}
