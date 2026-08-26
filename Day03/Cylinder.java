package abstractclass;

public class Cylinder extends Circle{

	double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	double getArea() {
		return (2*PI*radius*radius) + (2 * PI * radius * height);
	}
	

}
