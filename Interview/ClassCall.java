package Interview;

public class ClassCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDeclare cd= new ClassDeclare();
		System.out.println(cd.a);
		System.out.println(cd.methodSum(cd.a,20));
		ClassDeclare cd1= new ClassDeclare();
		cd1.a=20;//overirden
		System.out.println(cd1.a);
	}

}
