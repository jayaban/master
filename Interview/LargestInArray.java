package Interview;

import java.util.Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {20,8,90,71,4,52,1,199};
//Arrays.sort(arr);
//System.out.println(arr[arr.length-1]);
int maxnum= arr[0];
System.out.println(arr.length);
for(int i =0; i<=arr.length-1;i++) {
	
	if(arr[i]>maxnum ) {
		maxnum = arr[i];
		
		//break;
	}
	}

	}

}
