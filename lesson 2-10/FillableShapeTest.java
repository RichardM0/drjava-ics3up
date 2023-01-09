public class FillableShapeTest {
    public static void main(String[] args){
        Rectangle a = new Rectangle(-4, -3, -2, -1, true);
        Rectangle b = new Rectangle(3, 7, 2, 1, true);
        System.out.println(a);
        System.out.println(a.getFilled());
        a.setFilled(false);
        System.out.println(a.getFilled());
        a.setX1(4);
        System.out.println(a.getX1());

        a.setX2(-5);
        System.out.println(a.getX2());

        a.setY1(0);
        System.out.println(a.getY1());

        a.setY2(5);
        System.out.println(a.getY2());
        System.out.println(b.getNumRectangles());
        System.out.println(a);
        System.out.println(b);
        System.out.println(b.isOverLapping(a));

        Oval x = new Oval(0,10,0,6, false);
        System.out.println(x.getWidth());
        System.out.println(x.getLength());
        System.out.println(x.calcArea());
        System.out.println(x.isCircle());
    }   
}
