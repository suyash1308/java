package first;

public class Circle {
	float pi;
	int r;
	float area;
	float circumference;
	
	int circle() {
		pi=3.14f;
		r=5;
		area=pi*r*r;
		circumference=2*pi*r;
		return 0;
		
	}
	public static void main (String[] args) {
		
		Circle obj=new Circle();
		obj.circle();
		
		System.out.println("area of circle:"+obj.area);
		System.out.println("circumference of circle:"+obj.circumference);
	}
	
}
