package Interview;

public class LeftTriangleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 5;
		for(int i =1; i<n;i++)
		{
			int space = n-i;
			for(int s=0;s<=space;s++)
			{
				
				System.out.print(" ");
			
			}
			for(int j=1; j<=i;j++)
			{
				
				System.out.print(j);
			
			}
			System.out.println();
		}
			}

	}


