public class DateTest{
  public static void main(String[] args){
    Date todayDate = new Date(9, 12, 22);
    System.out.println(todayDate.getDay());
    System.out.println(todayDate.getMonth());
    System.out.println(todayDate.getYear());
    
    System.out.println(todayDate.toString());
    
    todayDate.setDay(24);
    System.out.println(todayDate.getDay());
    todayDate.setMonth(5);
    System.out.println(todayDate.getMonth());
    todayDate.setYear(16);
    System.out.println(todayDate.getYear());
    
    System.out.println(todayDate.toString());
  }
}
