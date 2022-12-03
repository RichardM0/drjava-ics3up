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
