public class Rectangle {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private boolean filled;

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
    }

    public String toString(){
        return "first coordinate: " + "("+x1+", "+y1+")" +"\n"+"second coordinate: "+ "("+x2+", "+y2+")";
    }
}
