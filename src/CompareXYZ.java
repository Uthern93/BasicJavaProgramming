import java.util.Scanner; // import scanner to program
public class CompareXYZ { //start of class

    public static void main(String[] args) { //Start of main method

        //Create Scanner object
        Scanner input=new Scanner(System.in);
                
        //Variable declaration
        int x,y,z;
        System.out.println("Please Enter integer X: ");
        x = input.nextInt();
        System.out.println("Please Enter integer y: ");
        y = input.nextInt();
        System.out.println("Please Enter integer z: ");
        z = input.nextInt();

        //Control Selection Statement
        if (x > y) {
        
            if(x > z){
                System.out.println(x +" is the highest number");
            }
            else{
                System.out.println(z +" is the highest number");
            }
        } 
        else{
            if (y>z)
            System.out.println(y +" is the highest number");
            else
            System.out.println(z +" is the highest number");   
        }// end of Control Selection
    }// end of main method
}// end of class
