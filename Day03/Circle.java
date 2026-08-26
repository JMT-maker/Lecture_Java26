package abstractclass;

import java.util.Scanner;

public class Circle {
	
	static double PI = 3.14;
	
	double radius;
	
	Scanner sc = new Scanner(System.in);
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
	
	}
	
	double getArea() {
		
		return radius * radius * PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}
