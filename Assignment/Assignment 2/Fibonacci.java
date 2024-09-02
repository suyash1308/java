package first;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n= sc.nextInt();
		sc.close();
		
		int firstTerm=0,secondTerm=1;
		System.out.println("Fibonacci series upto"+n+"terms");
		for(int i=1; i<=n;i++) {
			System.out.println(firstTerm +"");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
	}
	}
}
