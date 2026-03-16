
import java.util.*;
 public class odd {
    public static void main(String[] args) {
    System.out.println("enter the no");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = oddsum(n);
    System.out.println("sum of odd no " + sum);
    }
    public static int oddsum(int n){
        int sum = 0; 
        for(int i =1; i<=n; i=i+2){
            System.out.println(i);
            sum += i;
        }
        return sum;
    }
}