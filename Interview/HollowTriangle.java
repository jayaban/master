package Interview;

public class HollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 6;
		for(int i =1; i<=n;i++)
		{
			int space = n-i;
			
			for(int s=1;s<=space;s++)
			{
				
				System.out.print(" ");
			
			}
			for(int j=1; j<=2*i-1;j++)
			{
				if(j==1||i==n||j==2*i-1)
				{
				System.out.print("*");}else
					System.out.print(" ");
			
			}
			System.out.println();
		}
			}
	}

