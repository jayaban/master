package Interview;

import java.util.Scanner;

public class StringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
String name = sc.nextLine();
int count=0;
for(int i =0; i<name.length();i++)
{
	count++;
}
System.out.println(count);
	}

}
