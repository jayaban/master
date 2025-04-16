package Interview;

public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =5;
for(int i =1; i<=n;i++) {
	
	
	int totalColsInRow= i > n ? 2*n-i : i;
	int space = n-totalColsInRow;
	for(int s=1;s<space;s++) {
		System.out.print(" ");
	}
	for(int j =1;j<=totalColsInRow;j++) {
		if(i==1||j==2*i-1)
		{System.out.print("*");}else
			System.out.print(" ");
	}
	System.out.println();
}
	}

}
