package first;

public class Rectangle {
int side; int area;
int length; int width; int perimeter;

	void rec() {
		side=12;
		area=side*side;
		length=10;
		width=5;
		perimeter=2*(length+width);
		
	}
	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.rec();
		System.out.println("The area of rectangle is:"+obj.area);
		System.out.println("The perimeter of rectangle is:"+obj.perimeter);
	}
}
