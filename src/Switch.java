public class Switch{ // class declaration

    public static void main(String[] args) { //start of main method
        
        //Declare input object
        int month =Integer.parseInt(args[5]);

        //switch statement
        switch (month) {
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
            default:
                System.out.println("Wrong Choice");
        } //end of switch statement

    } // end of main method

} // end of class
