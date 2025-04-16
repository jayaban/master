package Interview;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n is no.of rows
		
		for(int i =1;i<2*n;i++)
		{
			int totalColsInRow= i > n ? 2*n-i : i;
			int space = n-totalColsInRow;
			for(int s = 0; s<=space;s++) {
				System.out.print(" ");
			
			}
			for(int j =1; j<totalColsInRow;j++)
			{
				System.out.print(" *");
				
			}
			System.out.println();
		
		}
		
	}

}
