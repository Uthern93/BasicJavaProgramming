
public class Student {
    
    String name;
    String noMatric;
    String noIC;
    String noHp;
    int age;
    
    void getInfo(){
        name="Uthern";
        noMatric="03DDT20F2011";
        noIC="001001-02-0703";
        noHp="0182174993";
        age=22;
    }
    void displayInfo(){
        System.out.println("My name is : "+ name);
        System.out.println("My matric number is : "+ noMatric);
        System.out.println("My HP number is : "+ noHp);
        System.out.println("I am " + age + " years old");
        System.out.println("My IC number is : "+ noIC);
    }
    public static void main (String[]args) {
        Student s1=new Student();
        s1.getInfo();
        s1.displayInfo();
    }//end of main method
}//nd of class
