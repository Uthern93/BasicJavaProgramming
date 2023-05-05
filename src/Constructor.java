
public class Constructor { //Start of class
String StudentName;

    Constructor(String name) { //1 parameter String
        StudentName=name;
        System.out.println(StudentName+" panggil constructor");
    } //end of consturctor

    void read() {
        System.out.println(StudentName+" membaca method");
    }

    public static void main(String[] args) {
        Constructor cons = new Constructor("Uthern"); //constructor do not need to be called it is called automatically
        cons.read();
        cons.StudentName = "Kamil";
        cons.read();
    }
} //end of class
