package first;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter a no.");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=1;
		// num=5...1*2*3*4*5
		for(int i=1; i<=num; i++) {
			temp=temp*i;
			
		}
		System.out.println("factorial is:"+temp);
		
	}
	

}
