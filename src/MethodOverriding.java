
class StudentKoko {

    String sport; //variables

    void mainkoko(String sukan) { //method overriding 1
        this.sport = sukan; //Assign parameters to variables
        System.out.println("Student bermain :" + sport); //Display output
    } //end of method oerriding
}

class DPR extends StudentKoko { //subclass 1

    void mainkoko(String sukan) { //method overriding 2
        this.sport = sukan; //assign parameters to viariable
        System.out.println("DPR :" + sport); //Display output
    } // end of method overriding 2
} //end of subclass DPR

class DET extends StudentKoko { //Subclass 2

    void mainkoko(String sukan) { //method overriding 3
        this.sport = sukan; //Assign parameters to variables
        System.out.println("DET :" + sport); //Display Output
    }// end of method overrding 3
} //end of subclass 2

class DKA extends StudentKoko { //subclass 3

    void mainkoko(String sukan) { //method overrding 4
        this.sport = sukan; //Assign parameters to variables
        System.out.println("DKA :" + sport); //Display output
    } //End of method overriding 4
} //End of subclass 3

class TestStudentKoko { //Start of class TestStudentKoko

    public static void main(String[] args) { //Main method
        StudentKoko a1 = new StudentKoko(); //Create object StudentKoko
        DPR b1 = new DPR(); //Create object DPR
        DET c1 = new DET(); //Create object DET
        DKA d1 = new DKA(); //Create object DKA
        b1.mainkoko("Badminton"); //
        c1.mainkoko("Takraw");
        d1.mainkoko("Bola Sepak");
    }

}
