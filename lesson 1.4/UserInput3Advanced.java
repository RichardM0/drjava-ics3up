import javax.swing.JOptionPane;
 
public class UserInput3Advanced {
    public static void main(String[] args) {
        int age;
        String name;
        
        // Display a simple message, centered on the screen
        JOptionPane.showMessageDialog( null, "Look, no Scanner!" );
        
        // Prompt the user for their name and age using GUI dialogs
        name = JOptionPane.showInputDialog( "What is your full name: " );
        // Read age as a String, but convert it to an int
        age = Integer.parseInt( JOptionPane.showInputDialog( "How old are you: " ) );
        
        System.out.print( "Well, " + name);
        System.out.println( ", you are " + age + " years old." );
  }  
}

