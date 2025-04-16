package Interview.ArrayPrograms;

public class NumberPresence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[]= {52,40,100,60,98};
int searchNum = 101;
boolean isTheNumPresent = false;

for(int a :x)
{
	if(a==searchNum)
	{
		
		System.out.println("Number found");
		isTheNumPresent= true;
		break;
	}
}
if(isTheNumPresent==false)
{
	System.out.println("number not found");
}

	}

}
