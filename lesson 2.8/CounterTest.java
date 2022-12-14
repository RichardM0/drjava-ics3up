public class CounterTest {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        
        c1.increment();
        c1.increment();
        c2.increment();
        System.out.println(c1.getCounter1());
        System.out.println(c1.getCounter2());
        System.out.println(c2.getCounter1());
        System.out.println(c2.getCounter2());
    }
}
