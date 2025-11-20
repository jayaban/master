package Java;

public class CountOfCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "hello";
int count=0;

while(true)   //jab tak koi condition true h 
{
	try {
	s.charAt(count);  // s string k sare characters count krne h starting from 0 
	count++; // iske baad count ko badhana h jab tak string finish ni ho jati
	}
catch(IndexOutOfBoundsException e) {
System.out.println(count); // jese he string finish hogi or count bdhega toh exception ayega usko andle krna h
break;
}
}
	
}
}


