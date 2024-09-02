package first;
import java.util.Scanner;
public class Arithmetic {
	void add(int a,int b) {
		int s=a+b;
		System.out.println("Addition is:"+s);
	}
	void sub(int a,int b) {
		int s=a-b;
		System.out.println("subtraction is:"+s);
	}
	void mul(int a,int b) {
		int s=a*b;
		System.out.println("multiplication is:"+s);
	}
	void div(int a,int b) {
		int s=a/b;
		System.out.println("division is:"+s);
	}
	public static void main (String args[])
	{
		Arithmetic y=new Arithmetic();
		y.add(5,7);
		y.sub(5,7);
		y.mul(5,7);
		y.div(5,7);
	}
}
	
	
	
	
	
	
	
	

	/*int add(int n1,int n2
			//) {
		//Scanner sc=new Scanner(System.in);
		
		//System.out.println("enter 1st no:");
		//int var1=sc.nextInt();
		
		//System.out.println("enter 2nd:");
		//int var2 =sc.nextInt();
		
		
	}
*/