public class Rectangle extends FillableShape{
    private static int numRectangles = 0;

    public Rectangle(){
        numRectangles++;
    }
    public Rectangle(int x1, int x2, int y1, int y2, boolean filled){
        super(x1,x2,y1,y2,filled);
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
        numRectangles++;
    }

    public int getNumRectangles(){
        return numRectangles;
    }

    public double calcArea(){
        return (double)(super.getLength())*(double)(super.getWidth());
    }
      
    public boolean isOverLapping(Rectangle other){
        if((super.getUpperLeftX() > other.getBottomRightX()) || (super.getBottomRightY() > other.getUpperLeftY())){
            return false;
        }
        else{
            return true;
        }


    }
    @Override
    public String toString(){

        return super.toString() +"\n"+"Rectangle with length: " + super.getLength() + " and width: " + super.getWidth();
    }


}
