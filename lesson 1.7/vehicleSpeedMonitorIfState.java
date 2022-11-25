import java.util.Scanner;
public class vehicleSpeedMonitorIfState{
    public static void main ( String[] args ){
        Scanner input = new Scanner( System.in );

        int speed;

        System.out.println("What is your speed? ");
        speed = input.nextInt();

        if(speed>51 && speed<60){
          System.out.println("Driving within speed limit.");
        }
        else{
          System.out.println("Adjust your speed.");
        }
        

        input.close();


    }
}