import java.util.*;
public class bill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount of  pencil:");
        float pencil = sc.nextFloat();
        System.out.println("enter the amount of  pen:");
        float pen = sc.nextFloat();
        System.out.println("enter the amount of  eraser:");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("---BILL---");
        System.out.println("pencil:" + pencil);
        System.out.println("pen:" + pen);
        System.out.println("eraser:" + eraser);
        System.out.println("total:" + total);
        System.out.println("---------------");
    }
}