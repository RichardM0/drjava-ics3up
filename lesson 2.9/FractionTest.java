public class FractionTest {
    public static void main(String[] args){
        Fraction f = new Fraction(1,2);
        Fraction fTwo = new Fraction(5,7);
        
        f.setNum(2);
        System.out.println( "Numerator was just set to " + f.getNum() );

        f.setDen(0);  // defaults to 1
        System.out.println( "Denominator was just set to " + f.getDen() );

        System.out.println( "toString() method returned: \"" + f + "\"" );
        
        f.setDen(3);

        System.out.println(f.toDouble());
        System.out.println("Multiplying: " + f + " by " + fTwo);
        System.out.println(f.multiply(fTwo));
        System.out.println("Dividing: " + f + " by " + fTwo);
        System.out.println(Fraction.divide(f, fTwo));
    }
}
