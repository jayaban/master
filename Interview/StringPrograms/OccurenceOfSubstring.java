package Interview.StringPrograms;

public class OccurenceOfSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="testtesttesttest";
String sub="test";

int count=0, idx=0;

while((idx=str.indexOf(sub, idx))!=-1)  //this searches substring "test" in the string given starting from idx
	//if found it updates the idx , the loop continues till the sub not found that is -1
{
	count++;  //count will be increased by 1 
	idx+=sub.length();  // After finding one occurrence of sub,
	//we move idx forward by the length of the substring so we don't count overlapping substrings or get stuck in an infinite loop.
}
System.out.println("occurences are: "+ count); 

////idx = 0 (initial)
//
//str.indexOf("test", 0) → returns 0 → count = 1 → idx = 0 + 4 = 4
//
//str.indexOf("test", 4) → returns 4 → count = 2 → idx = 4 + 4 = 8
//
//str.indexOf("test", 8) → returns 8 → count = 3 → idx = 8 + 4 = 12
//
//str.indexOf("test", 12) → returns 12 → count = 4  idx = 12+4 =16

//str.indexOf("test",16) returns 16  returns -1 loop ends
	}

}
