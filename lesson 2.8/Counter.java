public class Counter {
    private int counter1;
    private static int counter2;
    
    public void increment() {
        counter1++;
        counter2++;
    }
    
    public int getCounter1() {
        return counter1;
    }
    
    public int getCounter2() {
        return counter2;
    }
}
