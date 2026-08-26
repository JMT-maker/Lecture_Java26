package abstractclass;

public class Ball extends Circle{

	public Ball(double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return radius * radius * PI * 4;
	}
}
