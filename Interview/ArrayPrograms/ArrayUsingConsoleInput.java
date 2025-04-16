package Interview.ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUsingConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = new int[5];

Scanner sc = new Scanner(System.in);
for(int i =0; i<=a.length-1;i++) {
	System.out.println("enter a number for position"+i+" ");
a[i]= sc.nextInt();

}
System.out.println(Arrays.toString(a));

	}

}
