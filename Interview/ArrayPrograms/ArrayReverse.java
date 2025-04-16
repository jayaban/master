package Interview.ArrayPrograms;

import java.util.Arrays;

public class ArrayReverse {
	public static void reverseArray(int[] ar){
		int left=0, right=ar.length-1; //divided array into two parts
		while(left<right)  //till the time left element is less than right element
		{
			int temp=ar[left]; //store the left element into temp
			ar[left]=ar[right]; //store the right element into left
			ar[right]=temp; //store the temmp element into right
			left++; // increase left by 1
			right--; //decrease right by 1
		}

			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]= {20,10,55,89,90};
String a = Arrays.toString(ar);
System.out.println(a);
reverseArray(ar);
System.out.println("reversearray is"+Arrays.toString(ar));
}

}
