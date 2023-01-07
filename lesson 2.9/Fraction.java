public class Fraction {
    private int num;
    private int den;

    public Fraction(int num, int den){
        this.num = num;
        this.den = den;
        if (den == 0) {
            System.err.println( "Attempt to set denominator to 0 ignored, setting to 1 by default." );
            den = 1;
        }
    }
    
    // Accessor for numerator instance variable
    public int getNum() {
        return num;
    }
    
    // Accessor for denominator instance variable
    public int getDen() {
        return den;
    }
    
    // Mutator for numerator instance variable
    public void setNum(int newNumerator) {
        num = newNumerator;
    }
    
    // Mutator for denominator instance variable
    public void setDen(int newDenominator) {
        // Sanity checking ensures a non-zero denominator
        if (newDenominator == 0) {
            System.err.println( "Attempt to set denominator to 0 ignored, setting to 1 by default." );
            den = 1;
        }
        else {
            den = newDenominator;
        }
    }

    private int gcd( int a, int b ) {
        if ( b == 0 ) {
            return a;
        }
        else {
            return gcd( b, a % b );  
        }
    }

    public void reduce() {
        int greatestCommonFactor = gcd( num, den );
        num = num / greatestCommonFactor;
        den = den / greatestCommonFactor;        
    }

    public Double toDouble(){
      return (double)(num)/(double)(den);
    }
    
    public Fraction multiply(Fraction other){
        int newNum = other.getNum() * getNum();
        int newDen = other.getDen() * getDen();

        Fraction product = new Fraction(newNum, newDen);
        product.reduce();
        return product;

    }

    public static Fraction divide(Fraction f1, Fraction f2){
        int newNum = f1.getDen();
        int newDen = f1.getNum();
        Fraction reversedOther = new Fraction(newNum, newDen);
        Fraction finalQuotient = f2.multiply(reversedOther);

        return finalQuotient;
    }
    
    // Display the fraction on screen
    public String toString() {
        return( num + " / " + den );
    }
}