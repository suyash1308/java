package first;

public class QE {

public static void main(String[] args) {
	int a=6,b=-18,c=-3;
	
	float d=2*a;
	float q1=(float) ( (-b) + Math.sqrt(b*b) - (4 * a * c) );
	float q2=(float) ( (-b) - Math.sqrt(b*b) - (4 * a * c) );
	
	float f1=q1/d;
	float f2=q2/d;
	System.out.println("Factorial of first" +f1);
	System.out.println("Factorial of second" +f2);
}
}
	
	