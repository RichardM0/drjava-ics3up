
public class Fraction {
    private int num;
    private int den;
    
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
    
    public Double toDouble(){
      return (double)(num)/(double)(den);
    }
    
    
    // Display the fraction on screen
    public void printIt() {
        System.out.println( num + " / " + den );
    }
}


