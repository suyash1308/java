package first;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n, rev=0, p;
		System.out.println("Enter a number:");
		n=sc.nextInt();
		p=n;
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
			
		}
		if (rev == p)
		{
			System.out.println("This no.is palindrome");
		}
		else
		{
			System.out.println("This no.is not palindrome");
		}
		
		
	}
	
	

}
