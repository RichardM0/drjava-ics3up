public class Date{
  private int day;
  private int month;
  private int year;
  public Date(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public void setDay(int newDay){
    day = newDay;
  }
  
  public void setMonth(int newMonth){
    month = newMonth;
  }
  
  public void setYear(int newYear){
    year = newYear;
  }
  
  public int getDay(){
    return day;
  }
  
  public int getMonth(){
    return month;
  }
  
  public int getYear(){
    return year;
  }
  
  public String toString(){
    return day + "/" + month + "/" + year;
  }
}
