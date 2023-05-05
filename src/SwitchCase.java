
import java.io.*; //import all classes of input output
public class SwitchCase { // class declaration

    public static void main(String[] args) throws IOException { //start of main method
        
        //Declare input object
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufReader = new BufferedReader(reader);
        
        //User Input
        System.out.println("Please Enter Months (1-12): ");
        String str1 = bufReader.readLine();
        System.out.println("Month You Entered : " + str1);
        int months = Integer.parseInt(str1); // convert string to integer

        //switch statement
        switch (months) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("Wrong Choice");
        }

    } // end of main method

} // end of class
