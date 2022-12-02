public class checkTriangle{
  public static void main(String[] args){
  }
  public static boolean isTriangle(int x, int y, int z){
    if(x + y > z || x + z > y || z + y > x){
      return true;
    }
    
    else{
      return false;
    }
      
  }
}
