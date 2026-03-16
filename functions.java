import java.util.*;
public class functions {
    public static int printfactorial(int n){
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printfactorial(n);
    }
}

    //public static void printMyName(String name){
      //  System.out.println(name);
        //return;
    
   // public static void main(String args[]){
     //   Scanner sc = new Scanner(System.in);
       // String name = sc.next();
        //PrintMyName(name);
   // }
//}