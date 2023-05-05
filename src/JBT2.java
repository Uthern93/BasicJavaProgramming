
public class JBT2 { //start of class JBT2

    JBT2() {
        this(100); //panggil constructor 2
        System.out.println("Inside Constructor without parameter");
    } //end of Constructor 1

    JBT2(String str) {
        System.out.println("Inside Constructor with String parameter as " + str);
    } // end of Constructor 2

    JBT2(int x) {
        System.out.println("Inside Constructor with Integer parameter as " + x);
    } // end of Constructor 2

    public static void main(String[] args) { //start of main method
        JBT2 obj = new JBT2();
        System.out.println("*************************************");
        JBT2 obj2 = new JBT2("YED");
    } // end of main method
} //end of class JBT2
