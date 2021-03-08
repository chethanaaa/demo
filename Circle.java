package demo;

public class Circle implements Shape{
	@Override
	public double calculateArea(int radius) {
		return 3.14*radius*radius;
	}

	@Override
	public double calculateArea(int dimension1, int dimension2) {
		// TODO Auto-generated method stub
		return 0;
	}
}