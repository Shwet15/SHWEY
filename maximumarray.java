public class maximumarray{
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,3};
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.err.println("Max =" + max);
    }
}