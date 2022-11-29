public class patternB {
    public static void main(String[] args)
    {
        String thingy = "**********";
        for(int i=10; i>0; i--){
            thingy=thingy.substring(1, i); 
            System.out.println(thingy);
        }
    }
}
