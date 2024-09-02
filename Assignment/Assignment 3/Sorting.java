package First;
import java.util.Scanner;
public class Sorting {
	public static void main(String args[]) {
		int a[]=new int[5];
		int temp;
		System.out.println("Enter Elements");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++) 
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		System.out.println("Sorting elements:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
