
public class PassObjectDemo { // Start of class

    public static void main(String[] args) {
        //Create an object for class rectangle
        Rectangle rect = new Rectangle(10.0, 20.0);

        //Display the object's content
        System.out.println("Length : " + rect.getLength());
        System.out.println("Width : " + rect.getWidth());
        System.out.println("Area : " + rect.getArea());
        System.out.println("Perimeter : " + rect.getPerimeter());
        System.out.println("********************************************");
        //pass the object to the ChangeRectangle method
        changeRectangle(rect);
        System.out.println("Length : " +rect.getLength());
        System.out.println("Width : " + rect.getWidth());
        System.out.println("Area : " + rect.getArea());
        System.out.println("Perimater: " + rect.getPerimeter());
    } //end of main method
    public static void changeRectangle(Rectangle r) {
        //The Folowing method accepts an Rectangle
        //object as an argument and change its content
        r.set(30,5);
    }// wnd of changeRectangle method
} // end of class PassObejctDemo
