/**
* function that returns a number raised to the power of another number
*
* @param  base  the number that is being exponentially increased
* @param  expo  the number of times that number is being exponentially increased
* @return       the exponential increase of a base and its exponent
* @see          result
*/
public class Power{
  public static void main(String[] args){
    System.out.println(iterativePower(3, 4));
  }
  public static int iterativePower(int base, int expo){
    int outBase = 1;
    for(int i=0;i<expo;i++){
      outBase*=base;
    }
    
    return outBase;
  }
}
