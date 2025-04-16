package Interview;

public class Duplicate {

	public static void main(String[] args) {
		int arr[] = {3,3,4,5,6,7,5,9,10,20,10,25,60,25};
		
		int dup=arr[0];
		for(int i = 0; i<= arr.length-1;i++)
		{
			
		for(int j =i+1;j<=arr.length-1;j++)
		{
			
		if(arr[i]==arr[j])
		{
			dup=arr[i];
			System.out.println("duplicate number"+arr[i]);
		}
		}
		}

	}

}
