public class reversearray{
   public static void main(String args[]){
    int [ ] arr = {3,4,5,6,7};
    int [] rev = new int[arr.length];
    for (int i= 0; i<arr.length; i++){
        rev[i] = arr[arr.length -1 -i];
    }
    for(int i : rev){
        System.out.println(i + " " );
    }
   } 
}