import java.util.*;
public class greater{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first no.");
    int a = sc.nextInt();
     System.out.println("enter the second no.");
    int b = sc.nextInt();
    int result = greatestno(a,b);
    System.out.println("the greates no is: " + result );
}
    public static int greatestno(int a, int b){
if(a > b){
    return a;
}else {
    return b;
}
    }

}
