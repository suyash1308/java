package first;
import java.util.Scanner;

public class Power {
	public static void main(String args[]) {
		int i,n,p,result=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		System.out.println("Enter power:");
		p=sc.nextInt();
		
		for(i=1; i<=p; i++)
		{
			result=n*result;
		}
		System.out.println("Power:"+result);
		
	}

}
