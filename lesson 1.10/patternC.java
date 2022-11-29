public class patternC {
    public static void main(String[] args)
    {
        String thingy = "**********";
        for(int i=10; i>0; i--){
            thingy=thingy.substring(1, i);
            System.out.printf("%10s\n", thingy);
        }
    }
}
