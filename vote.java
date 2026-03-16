import java.util.*;
public class vote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int a = sc.nextInt();
     eligible(a);
    }
    public static boolean eligible(int a) {
    if(a >= 18){
             System.out.println("you are eligible to vote"); 
        } else{
           System.out.println("you are not eligible to vote");  
        }
    return a >= 18;
    }
} 