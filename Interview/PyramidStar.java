package Interview;

public class PyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n= 5;
//for (int i =0;i<=rows-1;i++) {       //i =0 > k =4 4>0 print space
//	for(int k=4;k>=i;k--) {
//		System.out.print(" ");
//	}
//	for(int j=0;j<=i;j++) {
//		System.out.print("* ");
//	}
//	System.out.println();
//}

for(int i =1; i<n;i++)
{
	int space = n-i;
	for(int s=0;s<=space;s++)
	{
		
		System.out.print(" ");
	
	}
	for(int j=1; j<=i;j++)
	{
		
		System.out.print("* ");
	
	}
	System.out.println();
}
	}

}
