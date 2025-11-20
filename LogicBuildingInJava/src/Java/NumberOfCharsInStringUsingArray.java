package Java;

import java.util.Scanner;

public class NumberOfCharsInStringUsingArray {
	public int numOfChars(String s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");  // string input le lia user se
		 s =sc.next();
		 
		 //is string ko ab char array mein store krna h
		  char c[] = s.toCharArray();
		  int count=0; //ek variable le lia h initialize kr lia h 0 se 
		  
		  //ab traverse krenge is array mein for each loop se
		   for(char x:c)
		   {
			   count++;   //jese he we will encounter a char count will be increased by 1
		   }
		 
		 return count;   //total count return hoga
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		NumberOfCharsInStringUsingArray n = new NumberOfCharsInStringUsingArray();
		
		System.out.println(n.numOfChars(st));

	}

}
