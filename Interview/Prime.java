package Interview;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a numer"+"\n");
		int num = sc.nextInt();
		int i;
//		if(num==0||num==1)
//			{System.out.println("not prime");}
		
		
//			for(i=2;i<num;i++) {
//				if (num%i==0) {
//					System.out.println("not primeprime");
//				}else {
//					System.out.println("prime");
//				}
//			}
		
			boolean prime=true;
			for(i =2;i<num;i++)
			{
				while(num%i==0)
				{
					prime=false;
					break;
				}
				
		}
			System.out.println(prime);
	}

	}


