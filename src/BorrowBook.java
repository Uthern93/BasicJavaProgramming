// Uthern A/L Sutin
import java.io.*;//import package
public class BorrowBook { // Start of Class

    // Variable Declaration
    String booktable[][] = new String[2][3];
    String name, name1;

    void insertData() throws IOException { // Start of method insertData()

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("**************** KG KELUBI LIBRARY ******************");
        System.out.print("Enter Borrower's Name : ");
        name = stdin.readLine();
        //looping statement 
        for (int i = 0; i < 1; i++) {

            //for statement 
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Book Title " +(j + 1)+ ":");
                booktable[i][j] = stdin.readLine();
            }
        }
        System.out.print("Enter Borrower's Name : ");
        name1 = stdin.readLine();

        for (int i = 1; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter Book Title" + (j + 1) + ":");
                booktable[i][j] = stdin.readLine();
            }//end of statement
        }// end of loop statement 
    }//End of method insertData()

    void display()//Start of method display()
    {
        //display output
        System.out.println("==================================================");
        System.out.println("\t Book Borrowing Table Kg Kelubi Library ");
        System.out.println("=================================================");
        System.out.print("Name" + "\t\t" + "Book 1" + "\t\t" + "Book 2" + "\t\t" + "Book 3 " + "\n");

        System.out.print(name);
        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("\t\t" + booktable[i][j]);

            }//end of for statement
        }// end of looping statement

        System.out.print("\n");

        System.out.print(name1);
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t\t" + booktable[i][j]);
            }//end of for statement 
        }//end of looping statement

        System.out.print("\n");
    }//end of method display()
}// end of class BorrowBook

class CaseStudy { //superclass

    public static void main(String[] args) throws IOException {

        BorrowBook b1 = new BorrowBook();
        b1.insertData();
        b1.display();
    }//end of main method 
}// end of class CaseStudy

