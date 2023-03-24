public class Loop {
    public static void main(String args[]){
        int a=5;
        int b=10;
        int c=40;
        //if a==5 then i want to print the sum of b+c and if a is not equals to 5 then it should print the b*c
        if(a==5){    //true
            System.out.println(b+c);
        }
        a=6;    //we can run both the loops if i change the value of a
        if(a!=5) {   // this block of code wont run
            System.out.println(b*c);
        }
    }
}








