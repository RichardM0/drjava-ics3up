public class analyzeCounterForLoop{
  public static void main(String[] args) {
    int counter1 = 0;
    int counter2 = 0;
    int counter3 = 0;
    int counter4 = 0;
    for ( int i = 0; i <= 4; ++i ) {
      counter1++;
      for ( int j = 0; j < 5; j++ ) {
        counter2 += counter1;
        if (i == j)
          counter3--;
        else
          counter4++;
      }
    }
    System.out.println( counter1 + " " + counter2 + " " + counter3 + " " + counter4 );
  }
}

