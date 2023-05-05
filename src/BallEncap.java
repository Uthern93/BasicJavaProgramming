
public class BallEncap {

    private String shape;
    private double size;
    private double weight;
    private String color;
    private String brand;

    // Getter
    public String getShape() {
        return shape;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    // Setter
    public void setShape(String newShape) {
        this.shape = newShape;
    }

    public void setSize(double newSize) {
        this.size = newSize;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
}// end of class

class MyBall {

    public static void main(String[] args) {
        BallEncap obj = new BallEncap();
        //obj.shape("OVAL"); 
        //System.out.println(obj.shape); //Because variable is private modifier

        obj.setShape("oval");
        System.out.println(obj.getShape());

        obj.setSize(23.0);
        System.out.println(obj.getSize() + "cm");
        
        obj.setWeight(410.0);
        System.out.println(obj.getWeight() + "g");
        
        obj.setColor("White Green Blue");
        System.out.println(obj.getColor());
        
        obj.setBrand("Gilbert");
        System.out.println(obj.getBrand());

    }
}
