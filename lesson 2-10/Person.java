public class Person {
    private String name;
        
    // No-argument constructor method
    public Person( ) {
        this( "No Name Given!" );  
    }
 
    // Parameterized constructor method
    public Person( String name ) {
        this.name = name;
    }
        
    // Accessor for name instance variable
    public String getName() {
        return name;
    }
 
    // Mutator for name instance variable
    public void setName( String newName ) {
        name = newName;
    }
    
    public String toString(){
      return name;
    }
}

