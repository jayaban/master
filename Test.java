public class Test {
    public static void main(String args[]){
        double a=10.5;
        int x=10;

        System.out.println("Hello test");  //words in "" are string
        System.out.println(5); //print numbers
        System.out.println("5");//here 5 is string
        System.out.println(x/3); //we can use operators but the calculated result would be shown in integers only
        x=20; /* if we want to modify the value of x during runtime */
        System.out.println(a+x); //adding double and int
        System.err.println("highlight!!!"); //to highlight message
        System.out.println(x+"hey");//string+int ==string
        System.out.println(x+a);
        System.out.println(x+""+a);//string+int ==string



    }
}
