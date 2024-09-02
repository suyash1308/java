package First;

public class Add {
	public static void main(String args[]) {
		int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int B[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]= new int[3][3];
		int d[][]= new int[3][3];
		int e[][]= new int[3][3];
		int f[][]= new int[3][3];
		 
		for(int i=0; i<3 ;i++)
		{
			for(int j=0; j<3; j++) {
				c[i][j]=A[i][j]+B[i][j];
				
			}
		}
		
		for(int i=0; i<3 ;i++)
		{
			for(int j=0; j<3; j++) {
				d[i][j]=A[i][j]-B[i][j];
			}
		}	
		
		for(int i=0; i<3 ;i++)
		{
			for(int j=0; j<3; j++) {
				e[i][j]=A[i][j]*B[i][j];
			}
		}	
		
		for(int i=0; i<3 ;i++)
		{
			for(int j=0; j<3; j++) {
				f[i][j]=A[i][j]/B[i][j];
			}
		}	
		
		System.out.println("Additiion is:");
		   for(int i=0; i<3 ;i++) {
			    for(int j=0; j<3; j++) {
				System.out.print(" "+c[i][j]);

			}
			System.out.println("");
		}
			
		System.out.println("Substaction is:");
			for(int i=0; i<3 ;i++) {
				for(int j=0; j<3; j++) {
					System.out.print(" "+d[i][j]);
				}
					System.out.println("");
		}
		System.out.println("multiplication is:");
			for(int i=0; i<3 ;i++) {
				for(int j=0; j<3; j++) {
					System.out.print(" "+e[i][j]);
				}
					System.out.println(" ");
		}
		
		System.out.println("division is:");
			for(int i=0; i<3 ;i++) {
				for(int j=0; j<3; j++) {
					System.out.print(" "+f[i][j]);
				}
					System.out.println(" ");
		}
			
			
			
			
				
			}
		}
		
		
		
		
		


