import java.util.*;
public class radius{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the radius");
    int r = sc.nextInt();
    double result = circumference(r);
    System.out.println("the circumfrence is " + result);
}
public static double circumference(int r){
    double circumfrence = 2*r*3.14;
return circumfrence;
}
}