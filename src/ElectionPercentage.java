import java.util.Scanner;
public class ElectionPercentage {
    
    //variable declaration
    Scanner in=new Scanner(System.in);
    double percent[][] = new double[5][3];
    String Dept1,Dept2,Dept3,Dept4,Dept5;
    
    void InsertData() { //  method
        System.out.println("**************** INSERT MPP CANDIDATE'S NAME******************");
        
        System.out.println("Enter Department's Name : ");
        Dept1 = in.nextLine();
        for (int i = 0; i < 1; i++) {

            //for statement 
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter 202"+(j)+"'s Percentage "+ ":");
                percent[i][j] = in.nextFloat();
            }
        }
        System.out.println("Enter Department's Name : ");
        Dept2 = in.nextLine();

        for (int i = 1; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter 202"+(j)+"'s Percentage "+ ":");
                percent[i][j] = in.nextFloat();
            }
        }System.out.println("Enter Department's Name : ");
        Dept3 = in.nextLine();
        for (int i = 2; i < 3; i++) {

            //for statement 
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter 202"+(j)+"'s Percentage "+ ":");
                percent[i][j] = in.nextFloat();
            }
        }
        System.out.println("Enter Department's Name : ");
        Dept4 = in.nextLine();
        for (int i = 3; i < 4; i++) {

            //for statement 
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter 202"+(j)+"'s Percentage "+ ":");
                percent[i][j] = in.nextFloat();
            }
        }
        System.out.println("Enter Department's Name : ");
        Dept5 = in.nextLine();
        for (int i = 4; i < 5; i++) {

            //for statement 
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter 202"+(j)+"'s Percentage "+ ":");
                percent[i][j] = in.nextFloat();
            }
        }
    }
    void DisplayInfo() {
        //display output
        System.out.println("==================================================");
        System.out.println("\t Election Percentage ");
        System.out.println("=================================================");
        System.out.print("Jabatan" + "\t\t" + "2020"+"\t\t" + "2021"+"\t\t" + "2022" +"\n");

        System.out.print(Dept1);
        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("\t\t" + percent[i][j]);

            }//end of for statement
        }// end of looping statement

        System.out.print("\n");

        System.out.print(Dept2);
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t\t" + percent[i][j]);
            }//end of for statement 
        }//end of looping statement
        
        System.out.print(Dept3);
        for (int i = 2; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("\t\t" + percent[i][j]);

            }//end of for statement
        }// end of looping statement
        
        System.out.print(Dept4);
        for (int i = 3; i < 4; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("\t\t" + percent[i][j]);

            }//end of for statement
        }// end of looping statement

        System.out.print(Dept5);
        for (int i = 4; i < 5; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("\t\t" + percent[i][j]);

            }//end of for statement
        }// end of looping statement
        System.out.print("\n");
    }//end of method display()
    }
    class Testing {
        public static void main(String[]args) {
        ElectionPercentage e1=new ElectionPercentage();
        e1.InsertData();
        e1.DisplayInfo();
        }
    }
