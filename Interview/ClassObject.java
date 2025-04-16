package Interview;

public class ClassObject {
	int x=10; //attribute---vraiables
	static void myMethod() {
		System.out.println("This is method");   //methods
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassObject myObj= new ClassObject(); //object created in main block
System.out.println(myObj.x);
myObj.myMethod();
	}

}
