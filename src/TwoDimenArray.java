// Uthern

import java.io.*;

public class TwoDimenArray { // start of class

    public static void main(String[] args) throws IOException { //start of main method
        int marks[][] = new int[2][3];
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufReader = new BufferedReader(reader);

        for (int x = 0; x < 2; x++) { //Start of first looping
            for (int y = 0; y < 3; y++) {
                System.out.println("Enter the marks: ");
                String m = bufReader.readLine();
                marks[x][y] = Integer.parseInt(m);
            }
        } // end of first for looping

        for (int x = 0; x < 2; x++) { // Start of second looping
            for (int y = 0; y < 3; y++) {
                System.out.println("Marks [" + x + "] [" + y + "] : " + marks[x][y]); //Display Output
            }
        } // end of second for looping

    } // end of main method
} // end of class
