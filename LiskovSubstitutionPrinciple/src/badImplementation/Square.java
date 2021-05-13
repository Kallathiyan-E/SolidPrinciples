package badImplementation;

public class Square extends Shape{

	public Square(int length, int breadth) {
		super(length, breadth);
	}

	public int area() {
		return getLength()*getLength();
	}
}
