public class practicearray {
public static void main(String args[]){
    int [] marks = {34, 56, 11, 45, 23};
int sum = 0;
for(int i = 0; i< marks.length; i++){
    sum = sum + marks[i];
}
System.out.println("the value of  sum is " + sum);
}
}