
import java.util.Scanner;
 public class averagefunction {
    public static void main(String[] args) {
        System.out.println("enter first no");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
     System.out.println("enter second no");
        int b = sc.nextInt();
         System.out.println("enter third no");
        int c = sc.nextInt();
        int result = calculateaverage(a,b,c);
         System.out.println("the average is " + result);
    }
    
     public static int calculateaverage(int a,int b, int c) {
         int average = (a+b+c)/3;
         return average;
     }
}