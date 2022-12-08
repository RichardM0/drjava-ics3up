import java.util.Scanner;
public class cities {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String line;
        String longestWord = "";
        int numCities = 0;
        do{
            System.out.print("Enter a city name (or 'done' to stop): ");
            line = in.nextLine();
            if(line.length()>longestWord.length()){
                longestWord = line;
            }
            numCities+=1;
        }
        while(!line.equals("done"));
        String finalWord = longestWord.toUpperCase();
        System.out.println(numCities-1 + " names were entered, the longest was: " + finalWord + "!");
        in.close();
    }

}
