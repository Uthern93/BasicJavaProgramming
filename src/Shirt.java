public class Shirt {

 public int shirtID = 0;
 public String description = "-description required-";
 //The color codes are R=Red ,B=Blue, G=Green,U=Unset
 public char colorCode = 'U';
 public double price = 0.0;
 public int quantityInStock = 0;
 
 //This method displays the value for an item
 public void displayInformation(){
 System.out.println("Shirt ID:");
 System.out.println("Shirt description:"+ description);
 System.out.println("Color code: " + colorCode);
 System.out.println("Shirt price: " + price);
 System.out.println("Quantity in stock:" + quantityInStock);
 
 }
public static void main(String[] args) {
    Shirt s1=new Shirt();
    s1.displayInformation();
    }//end of main method

} // end of class)​