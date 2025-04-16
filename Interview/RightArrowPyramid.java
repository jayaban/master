package Interview;

import java.util.Scanner;

public class RightArrowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1; i<2*n;i++) {
			
			int totalColsInRow= i > n ? 2*n-i : i;
			for(int j =1; j<totalColsInRow;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	
	}

}
