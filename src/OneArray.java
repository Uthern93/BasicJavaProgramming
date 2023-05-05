import java.io.*;
public class OneArray { // start of class

    public static void main(String[] args) throws IOException { //start of main method
        int marks []=new int[5];
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader bufReader = new BufferedReader (reader);
        
        for (int i=0; i<5; i++){
        System.out.println("Enter the marks: ");
        String str1=bufReader.readLine();
        marks[i]=Integer.parseInt(str1);
        } // end of first for looping
        
        for (int i=0; i<5; i++){
            System.out.println("Marks: " +(i+1) + " : " +marks[i]); // Display output
        }
    } // end of main method
} // end of class
