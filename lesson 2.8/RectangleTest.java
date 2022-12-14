public class RectangleTest {
    public static void main(String[] args){
      
        Rectangle a = new Rectangle();
        System.out.println(a);
        System.out.println(a.getNumRectangles());

        Rectangle b = new Rectangle(-4, -3, -2, -1, false);
        System.out.println(b);
        System.out.println(b.getNumRectangles());

        Rectangle c = new Rectangle(1,2,3,4,true);
        System.out.println(c);
        System.out.println(c.getNumRectangles());
        System.out.println(c.getUpperLeftX() + " " + c.getUpperLeftY());
        System.out.println("Width: " + c.getWidth() + " Length: " + c.getLength());
        System.out.println(c.calcArea());

    }
}