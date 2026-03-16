import java.util.Scanner;
public class countdigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
     int count = 0;

     if(n==0){
     count = 1;
     }else{
        while(n!=0){
            n = n/10; // last digit hatana
            count++;//count badhana
        }
             }
             System.out.print("NO.of digits: " + count);
    }
}