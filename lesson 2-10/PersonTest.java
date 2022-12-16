public class PersonTest{
  public static void main (String[] args){
    Teacher a = new Teacher("M. Tajalli", 1234567890, 12);
    System.out.println(a.getName());
    System.out.println(a.getYearsWorked());
    System.out.println(a.getID());
    a.setNewID(123456);
    System.out.println(a.getID());
    System.out.println(a);
  }
}
