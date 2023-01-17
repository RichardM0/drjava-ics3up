package shape2D;

public class Oval extends FillableShape{
    private static int numOvals = 0;

    public Oval(){
        numOvals++;
    }
    public Oval(int x1, int x2, int y1, int y2, boolean filled){
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
        numOvals++;
    }

    public int getNumOvals(){
        return numOvals;
    }

    public double calcArea(){
        double r1 = (double)(super.getWidth())/2.0;
        double r2 = (double)(super.getLength())/2.0;
        double pi = Math.PI;
        return r1*r2*pi;
    }
      
    public boolean isCircle(){
        return super.getWidth() == super.getLength();
    }
    @Override
    public String toString(){
        if(isCircle()){
            return super.toString()+"\n"+"Circle with length: " + super.getLength() + " and width: " + super.getWidth();
        }
        else{
            return super.toString()+"\n"+"Oval with length: " + super.getLength() + " and width: " + super.getWidth();
        }
    }
}
