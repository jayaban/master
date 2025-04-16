package Interview.ArrayPrograms;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {
	
	//onepass traverse
	
	public static int finding_secondlargest(int[] arr)
	{
		int largest =-1,secondlargest=-1;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest=arr[i];
			}else if(arr[i]<largest && arr[i]>secondlargest)
			{
				
				secondlargest=arr[i];
				
			}
		}
		
		return secondlargest;

	}
	public static int finding_secondsmallest(int[] arr) {
		int smallest =Integer.MAX_VALUE, secondsmallest=Integer.MAX_VALUE;
		
		for(int j =0; j<=arr.length-1;j++)
		{
			if(arr[j]<smallest)
			{
				secondsmallest=smallest;
				smallest=arr[j];
			}else if(arr[j]>smallest && arr[j]<secondsmallest)
			{
				secondsmallest=arr[j];
			}
		}
		return secondsmallest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,60,50,90,18};
System.out.println(finding_secondlargest(arr));

System.out.println(finding_secondsmallest(arr));		
	}

}
