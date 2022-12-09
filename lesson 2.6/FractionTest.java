public class FractionTest {
    public static void main(String[] args) {
        Fraction f = new Fraction();
        
        f.setNum(2);
        System.out.println( "Numerator was just set to " + f.getNum() );
        f.setDen(0);  // defaults to 1
        System.out.println( "Denominator was just set to " + f.getDen() );
        System.out.println( "toString() method returned: \"" + f + "\"" );
        f.setDen(3);
        f.printIt();
        System.out.println(f.toDouble());
    }
}

