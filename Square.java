package demo;

public class Square implements Shape{
	@Override
	public double calculateArea(int side) {
		return side*side;
	}

	@Override
	public double calculateArea(int dimension1, int dimension2) {
		// TODO Auto-generated method stub
		return 0;
	}
}