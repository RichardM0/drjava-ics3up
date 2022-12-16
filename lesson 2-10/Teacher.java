public class Teacher extends Person{
  private int teacherID;
  private int yearsWorked;
  
  public Teacher(String name, int teacherID, int yearsWorked){
    super(name);
    this.teacherID = teacherID;
    this.yearsWorked = yearsWorked;
  }
  
  public int getID(){
    return teacherID;
  }
  
  public void setNewID(int newID){
    teacherID = newID;
  }
  
  public int getYearsWorked(){
    return yearsWorked;
  }
  //Return statement of person/job
  @Override 
  public String toString(){
    return super.toString() + " has worked for " + yearsWorked + " years, and has ID: " + teacherID;
  }
}
