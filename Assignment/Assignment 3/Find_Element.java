package First;
import java.util.Scanner;
public class Find_Element {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		
		System.out.println("Enter Elements of array: ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Element of array: ");
		
		int x=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
		if(x==arr[i])
			{
				System.out.println("Element is found: ");
			}
			
			}
			
			
		}
		
		
		
	}


