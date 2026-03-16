import java.util.Scanner;
public class GCDESAMPLE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number");
        int a = sc.nextInt();
        System.out.print("enter the second number");
        int b = sc.nextInt();

        while(b!=0){
            int c = b;
            b = a%b;//remainder
            a = c;//update
        }
         System.out.print("GCD IS: " + a);
    }
}