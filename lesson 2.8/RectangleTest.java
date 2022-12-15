public class RectangleTest{
    public static void main(String[] args){
        Rectangle a = new Rectangle(-4, -3, -2, -1, true);
        System.out.println(a);
        System.out.println(a.getFilled());
        a.setFilled(false);
        System.out.println(a.getFilled());
        a.setX1(40);
        System.out.println(a.getX1());

        a.setX2(-5);
        System.out.println(a.getX2());

        a.setY1(0);
        System.out.println(a.getY1());

        a.setY2(5);
        System.out.println(a.getY2());
    }

}
