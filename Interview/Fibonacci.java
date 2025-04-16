package Interview;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n0=0, n1=1,n2,count =10;
		System.out.print(" "+n0+" "+n1);
		for(int i=2; i<=count; i++)
		{
			
			n2=n0+n1;
			System.out.print(" "+n2);
			n0=n1;
			n1=n2;
		}
	}

}
