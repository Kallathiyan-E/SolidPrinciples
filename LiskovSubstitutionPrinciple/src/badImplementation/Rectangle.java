package badImplementation;

public class Rectangle extends Shape{

	public Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	public int area() {
		return getLength()*getBreadth();
	}
}
