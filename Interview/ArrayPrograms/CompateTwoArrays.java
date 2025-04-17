package Interview.ArrayPrograms;

import java.util.Arrays;

public class CompateTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = {99,12,77,1,4,90,80};
		int[] ar2 = {12,77,1,99,80,4,90};
		
		if(ar1.length==0 && ar2.length==0)
		{
			System.out.println("Arrays are equal and both are Empty"); //edge case
			return;
		}
		if(ar1.length==0 && ar2.length!=0)
		{
			System.out.println("Cant compare"); //edge case
			return;
		}
		boolean[] visited = new boolean[ar2.length];  //to keep track of visisted elements status in case duplicate elements are there
		boolean isEqual= true;
		for(int i =0;i<=ar1.length-1;i++)
		{
			boolean found =false;    
			for(int j =0;j<=ar2.length-1;j++)
			{
				if(ar1[i]==ar2[j] && !visited[j])
				{
					found =true;
					visited[j]=true;
					System.out.println("Matched : ar1["+ i+"]"+ "with ar2["+j+"]"+ ar1[i]);
				}
			}
			if (!found)
			{
				System.out.println("No match : ar1["+ i+"]");
			}
			
		}
		if(isEqual)
		{
			System.out.println("arrays are equal");
			
		}else
			System.out.println("different;");
		
		
		
		

	}

}
