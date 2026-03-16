
import java.util.Scanner;

 public class takinginputs {
    public static void main(String[] args) {
       // System.out.println("taking input from the users");
//Scanner sc = new Scanner(System.in);
//System.out.println("enter number 1");
//int a = sc.nextInt();
//System.out.println(" enter number 2");
//int b = sc.nextInt();
//int sum = a+b;
//System.out.println("The sum of these number is");
//System.out.println(sum);
//boolean b1 = sc.hasNextInt();
//System.out.println(b1);
//shweta is a goodString str = sc.next();
//String str = sc.nextLine();
//System.out.println(str);
System.out.println("enter the speed in km/h:");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int answer = (number * 1000) / 3600;
    System.out.println(" speed in m/s:"  + answer);
    }
}