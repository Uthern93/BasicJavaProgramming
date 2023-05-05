
/**
 *
 * @author uthern A/L sutin
 */
public class LoopingWhile { //start of class 

    public static void main(String[] args) { // start of main method 

        int sum = 0;
        int i = 0;

        while (i <= 5) {
            sum = sum + i;
            i--;

        }// end of looping
        System.out.println("Total: " + sum);

    } //end of main method
} // end of class
