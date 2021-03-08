package demo;

public class Rectangle implements Shape {
	@Override
	public double calculateArea(int length, int breadth) {
		return length*breadth;
	}

	@Override
	public double calculateArea(int dimension) {
		// TODO Auto-generated method stub
		return 0;
	}
}
