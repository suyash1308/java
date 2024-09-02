package first;

public class Swapping {
	int a;
	int b;
	int c;
	
	int swap() {
	//using third variable
		a=3;
		b=2;
		c=a;
		a=b;
		b=c;
	//without using third variable
		//a=a+b;
		//a=a-b;
		return 0;
		
	}
	public static void main(String[]args) {
		
		Swapping obj=new Swapping();
		obj.swap();
		//a=a+b;
		//b=a-b;
		//a=a-b;
		System.out.println("value of a" +obj.a);
		System.out.println("value of b" +obj.b);
		
		}

}
