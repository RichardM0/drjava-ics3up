import java.util.Scanner;

public class allowVoteIfState {
    public static void main( String[] args ){
        Scanner input = new Scanner( System.in );

        int age;
        int legalAge = 18;

        System.out.println("How old are you?");
        age = input.nextInt();
        if(age>=legalAge)
        {
          System.out.println("Allowed to Vote");
        }
        else{
          System.out.println("Not allowed to Vote");
        }
        if(age>=13 && age<=19)
        {
          System.out.println("You are a teenager");
        }
        else{
          System.out.println("You are not a teenager.");
        }

        input.close();
    }
    
}