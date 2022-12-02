import java.util.*;
public class engToFrench{
    public static void main(String[] args){
        translate("Thank you");
    }
    public static void translate(String phrase){
        String output = "";
        switch(phrase.toLowerCase()) {
            case "no":
                output+="non";
                break;
                
            case "yes":
                output+="oui";
                break;
                
            case "please":
                output+="s'il vous plait";
                break;
                
            case "thank you":
                output+= "merci";
                break;
                
            case "you're welcome":
                output+= "il n'y a pas de quoi";
                break;
                
            case "goodbye":
                output+= "au revoir";
                break;
                
            default:
                System.out.println("unknown English word/phrase");
                
                
            
                
        }
        System.out.println(output);
        
    }
    
}