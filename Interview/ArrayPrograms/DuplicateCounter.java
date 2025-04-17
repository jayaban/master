
package Interview.ArrayPrograms;

public class DuplicateCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] ar ={10,33,15,1,19,10,66,66,1};
	        int count=0;
	        
	        for(int i=0;i<=ar.length-1;i++)
	        {
	            for(int j =i+1;j<=ar.length-1;j++)
	            {
	                if(ar[i]==ar[j])
	                {
	                	System.out.println(ar[i]);
	                    count++;
	                }
	            }
	        }
	        
	        System.out.println("Total Duplicates are:" + " "+count);

	}

}
