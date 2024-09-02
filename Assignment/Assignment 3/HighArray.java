package First;
import java.util.Scanner;
public class HighArray {
	public static void main(String args[]) {
		int max;
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in array:");
		for(int i=0; i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		}
		max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Highest element of array:"+max);
	}
		

}
