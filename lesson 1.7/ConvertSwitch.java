import java.util.Scanner;
public class ConvertSwitch {
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
      
        int choice;
        System.out.print("Please enter your choice (1, 2, 3, or 4):");
          
        choice = input.nextInt();
        switch (choice) {
          case 1:
            System.out.println("You selected 1.");
            break;
          case 2:
            System.out.println("You selected 2");
            break;
          case 3:
            System.out.println("You selected 3.");
            break;
          case 4:
            System.out.println("You selected 4.");
            break;
          default:
            System.out.println("Invalid choice.");
            break;
            
        }
    }
}
