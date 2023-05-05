//Start of class / class declaration
public class Rectangle { 
    
    // variable declaration
    private double length;
    private double width;

    public Rectangle() { //Constructor 1
        length=0.0;
        width=0.0;
    }
    public Rectangle(double l, double w) { //Constructor 2
        length=l;
        width=w;
    }
    
    //getter
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return 2 * (length+width);
    }

    //setter
    public void setLength(double l) {
        length=l;
    }

    public void set(double l, double w) {
        length=l;
        width=w;
    }

} // end of class