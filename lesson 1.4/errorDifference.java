import java.util.Scanner;
public class errorDifference{
  public static void main(String[] args) {
    // System.out.printline("Hello Java!");
    // this is a syntax error because instead of println, I used printline. However, below is the correct form.
    System.out.println("Hello Java!");
    
    // a logical error is an error done by the programmer, who outputs the incorrect output.
    // this code wants to print numbers 1 through 6
    for(int i=1;i<6;i++){
      System.out.println(i);
    }
    
    // instead, this prints 1 through 5.
    // Correctly done is below.
    for(int i=1;i<=6;i++){
      System.out.println(i);
    }
    
    // A run time error occurs when running the program, the interpreter stops running the code and displays an error code. Usually with inputs.
    // While a compiler error occurs when scanning your code and they detect an error.
    // Run time errors can occur when a wrongful datatype is inputted as input, or when you try to output the input and the variable does not exist.
    Scanner input = new Scanner( System.in );
        
    int age;
    String name;
        
    // This works fine
    System.out.print( "What is your full name: " );
    name = input.nextLine();
    System.out.print( "How old are you: " );
    
    age = input.nextInt();
        
    System.out.print( "Well, " + name);
    System.out.println( ", you are " + age + " years old." );

    
    // inputting a String for age would be improper here. It provides the error, java.util.InputMismatchException.
  }
}