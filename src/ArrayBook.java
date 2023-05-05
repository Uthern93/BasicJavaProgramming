
import java.io.*;

public class ArrayBook {

    String booktable[][] = new String[2][3];

    String name, name1;

    void insertData() throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("********* KG KELUBI LIBRARY *********");
        System.out.println("Enter Borrow's Name :");
        name = stdin.readLine();

        for (int x = 0; x < 1; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("Enter Book Title " + (y + 1) + " : ");
                booktable[x][y] = stdin.readLine();

            }
        }

        System.out.println("Enter Borrower's Name : ");
        name1 = stdin.readLine();

        for (int x = 1; x < 2; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println("Enter Book Title " + (y + 1) + " : ");
                booktable[x][y] = stdin.readLine();
            }
        }
    }

    void display() {

        System.out.println("============================================================");
        System.out.println("\t Book Borrowing Table Kg Kelubi Library");
        System.out.println("============================================================");
        System.out.println("Name" + "\t" + "Book 1" + "\t\t\t" + "Book 2" + "\t\t\t" + "Book 3" + "\n");

        System.out.print(name);
        for (int x = 0; x < 1; x++) {

            for (int y = 0; y < 3; y++) {
                System.out.print("\t" + booktable[x][y]);
            }
        }
        System.out.print("\n");

        System.out.print(name1);
        for (int x = 0; x < 1; x++) {
            for (int y = 0; y < 3; x++) {
                System.out.print("\t" + booktable[x][y]);
            }
        }
        System.out.print("\n");
    }

    class CaseStudy {

        public static void main(String[] args) throws IOException {
            ArrayBook b1 = new ArrayBook();
            b1.insertData();
            b1.display();
        }
    }
}
