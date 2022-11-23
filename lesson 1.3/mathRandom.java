import java.lang.Math; //importing Math class in Java
public class mathRandom{
  public static void main( String args[] ) {
    double rand = Math.random();
    int finalRand = (int)(7.0*rand);// generating random number 
    System.out.println("Random Number: " + finalRand);  // Output is different everytime this code is executed 
  }
}