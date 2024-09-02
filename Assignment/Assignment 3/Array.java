package First;
import java.util.Scanner;
public class Array {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int temp=0;
		
		System.out.print("Enter Elements");
		
		for(int i=1;i<size;i++) {
			arr[i]=sc.nextInt();
			temp= temp+ arr[i];
			
		}
		System.out.println("Calculate Sum:" +temp);
		
		int avg=temp/arr.length;
		System.out.println("Average is:" +avg);
		}
}
	
		
		
		

	

