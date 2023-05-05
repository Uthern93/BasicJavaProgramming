import java.io.*;
public class MPP {
    
    //variable declaration
    String mpp[][] = new String[2][3];
    String Dept,Dept1;
    
    void InsertData() throws IOException{ //  method
        BufferedReader bufreader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("**************** INSERT MPP CANDIDATE'S NAME******************");
        
        System.out.print("Enter Department's Name : ");
        Dept = bufreader.readLine();
        for (int i = 0; i < 1; i++) {

            //for statement 
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Candidate's Name " +(j + 1)+ ":");
                mpp[i][j] = bufreader.readLine();
            }
        }
        System.out.print("Enter Department's Name : ");
        Dept1 = bufreader.readLine();

        for (int i = 1; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter Candidate's Name " + (j + 1) + ":");
                mpp[i][j] = bufreader.readLine();
            }
        }
    }
    void DisplayInfo() {
        //display output
        System.out.println("==================================================");
        System.out.println("\t MPP Candidates' Name List ");
        System.out.println("=================================================");
        System.out.print("Jabatan" + "\t\t\t" + "Nama"+ "\n");

        System.out.print(Dept);
        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("\t\t" + mpp[i][j]);

            }//end of for statement
        }// end of looping statement

        System.out.print("\n");

        System.out.print(Dept1);
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t\t" + mpp[i][j]);
            }//end of for statement 
        }//end of looping statement

        System.out.print("\n");
    }//end of method display()
    }
    class Testing {
        public static void main(String[]args) throws IOException{
        MPP mpp1=new MPP();
        mpp1.InsertData();
        mpp1.DisplayInfo();
        }
    }
