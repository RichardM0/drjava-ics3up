import java.util.Scanner;
public class vehicleSpeedMonitor{
    public static void main ( String[] args ){
        Scanner input = new Scanner( System.in );

        int speed;

        System.out.println("What is your speed? ");
        speed = input.nextInt();

        System.out.println((speed>51 && speed<60) ? "Driving within Speed Limit" : "Adjust your speed limit.");
        // I used the ?: operator to see if it was in range of 51 and 60 (exclusive) If not, then it would direct to the second part.

        input.close();


    }
}