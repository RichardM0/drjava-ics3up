public class predictOutcome{
  public static void main(String[] args) {
    int a = 11;
    int b = 3;
    int c = 5;
    System.out.println("result = " + (a % b + 5 / c));
    System.out.println("result = " + (c * (-5 / 2) + b % 3 ));
    System.out.println("result = " + ((c + a % 4) * 4 - b)); 
  }
}

