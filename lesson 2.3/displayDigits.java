public class displayDigits {
    public static void main(String[] args){
        printDigits(13759);
    }
    public static int printDigits(int x){
        int out = x % 10;
        if (x == 0) {
            return 0;
        } 
        else {
            printDigits(x / 10);
        }
        System.out.println(out);
        return 0;

    }
}
