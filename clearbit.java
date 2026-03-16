public class clearbit{
    public static void main(String[] args) {
        int n = 5;
        int post = 2;
        int bitmask = 1<<post;
        int notbitmask = ~(bitmask);
        int newnumber = notbitmask & n;
        System.out.println(newnumber);
    }
}