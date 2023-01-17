package shape2D;
public class OvalTest {
    public static void main(String[] args){
        Oval a = new Oval(0,10,0,6, false);
        System.out.println(a.getWidth());
        System.out.println(a.getLength());
        System.out.println(a.calcArea());
        System.out.println(a.isCircle());
    }
}
