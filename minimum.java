public class minimum{
    public static void main(String[] args) {
        int [] arr = { 7,56,98,45,32};
        int min = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] < min) {
                min =arr[i];
            }
        }
        System.err.println("Min " + min);
    }
}