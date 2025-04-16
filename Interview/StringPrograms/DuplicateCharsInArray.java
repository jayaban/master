package Interview.StringPrograms;

public class DuplicateCharsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Hello World New Day";
int totalcount=str.length();
System.out.println(totalcount);
int afterreplacecount=str.replace("e","").length();

int totalcountofE= totalcount-afterreplacecount;

System.out.println(totalcountofE);


	}

}
