import java.util.Scanner;
public class doWhiletoWhile {
    
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner( System.in );
        String input;
        char key;
        System.out.println("Do you want to quit? ");
        input = keyboard.next();
        key = input.charAt(0);      
        while ( key != 'Y' && key != 'N')
        {
            System.out.printf("You entered: %c\n", key); 
            System.out.print("Do you want to quit? ");
            input = keyboard.next();
            // Get the first character from the input string
            key = input.charAt(0);     
        }
        keyboard.close();

        

    }
}
