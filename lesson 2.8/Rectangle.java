import java.lang.Math;
public class Rectangle
{
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private boolean filled;
    private static int numRectangles = 0;

    public Rectangle(){
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
        filled = false;
    }
    public Rectangle(int x1, int x2, int y1, int y2, boolean filled){
        if(x1<0){
            System.err.println("Coordinate: " + x1 + " is less than 0 (negative), set to default: 0");
            x1 = 0;
        }
        if(x2<0){
            System.err.println("Coordinate: " + x2 + " is less than 0 (negative), set to default: 0");
            x2 = 0;
        }
        if(y1<0){
            System.err.println("Coordinate: " + y1 + " is less than 0 (negative), set to default: 0");
            y1 = 0;
        }
        if(y2<0){
            System.err.println("Coordinate: " + y2 + " is less than 0 (negative), set to default: 0");
            y2 = 0;
        }
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
        this.filled=filled;
        numRectangles++;
    }
    public void setX1(int newX1){
        if(newX1<0){
            System.err.println("Coordinate: " + newX1 + " is less than 0 (negative), set to default: 0");
            newX1 = 0;
        }
        x1 = newX1;
    }
    public void setX2(int newX2){
        if(newX2<0){
            System.err.println("Coordinate: " + newX2 + " is less than 0 (negative), set to default: 0");
            newX2 = 0;
        }
        x2 = newX2;
    }
    public void setY1(int newY1){
        if(newY1<0){
            System.err.println("Coordinate: " + newY1 + " is less than 0 (negative), set to default: 0");
            newY1 = 0;
        }
        y1 = newY1;
    }
    public void setY2(int newY2){
        if(newY2<0){
            System.err.println("Coordinate: " + newY2 + " is less than 0 (negative), set to default: 0");
            newY2 = 0;
        }
        y2 = newY2;
    }

    public int getX1(){
        return x1;
    }
    public int getX2(){
        return x2;
    }
    public int getY1(){
        return y1;
    }
    public int getY2(){
        return y2;
    }
    public int getNumRectangles(){
      return numRectangles;
    }
    
    public int getUpperLeftX(){
      if(x1<x2){
        return x1;
      }
      else{
        return x2;
      }
      
      
    }
    public boolean getFilled(){
        return filled;
    }
    
    public void setFilled(boolean isFilled){
        filled=isFilled;
    }
    
        
    public int getUpperLeftY(){
      if(y1<y2){
        return y1;
      }
      else{
        return y2;
      }
      
      
    }
    
    public int getWidth(){
      return Math.abs(x1-x2);
    }
    
    public int getLength(){
      return Math.abs(y1-y2);
    }
    
    public double calcArea(){
      return (double)(getLength())*(double)(getWidth());
    }
    
    public String toString(){
        return "first coordinate: " + "("+x1+", "+y1+")" +"\n"+"second coordinate: "+ "("+x2+", "+y2+")";
    }
    

}
