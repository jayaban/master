package Interview.ArrayPrograms;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {10,15,70,89,22,33};
int max = arr[0];
int min= arr[0];

for(int i =0;i<=arr.length-1;i++)
{
	if(arr[i]>max)
	{
		max=arr[i];
	}

}
System.out.println("max no. is "+max);

	
	
	for(int j=0;j<=arr.length-1;j++)
	{
		if(arr[j]<min)
		{
			min=arr[j];
		}
	}
	System.out.println("min no. is "+min);
	}
}
