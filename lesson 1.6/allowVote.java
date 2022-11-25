import java.util.Scanner;

public class allowVote {
    public static void main( String[] args ){
        Scanner input = new Scanner( System.in );

        int age;
        int legalAge = 18;

        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println((age>=legalAge) ? "Allowed to Vote" : "Not Allowed to Vote" );
        System.out.println((age>=13 && age<=19) ? "You are a teenager" : "You are not a teenager");
        // I used the && operator to see if age is greater than 13, and less than 19.

        input.close();
    }
    
}
