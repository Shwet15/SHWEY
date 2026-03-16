import java.util.*;
public class average{
    public static void main(String args[]){
        int [] marks ={ 56,45,89,32,13};
        int sum = 0;
        for(int i = 0; i<marks.length; i++){
        sum = sum + marks[i];
    }
    System.out.println(" the average value of marks " + sum/marks.length);
}
}
