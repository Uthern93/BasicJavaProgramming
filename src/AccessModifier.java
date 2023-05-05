
public class AccessModifier {

    public String name;
    public int age;
    public String noTel;
    private String noIC;

    void getData() {
        name = "Uthern";
        age = 22;
        noTel = "0182174993";
        noIC = "001001-02-0703";
    } // end of method getData()

    void displayData() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Telephone No : " + noTel);
        System.out.println("Identity Card No : " + noIC);
    }// end of method displayData()

    public String getNoIC() { //getter method
        return noIC;
    }

    public void setNoIC(String noIC) { //setter method
        this.noIC = noIC;
    }
} // End of class

class Test {

    public static void main(String[] args) {
    AccessModifier ac = new AccessModifier();
    ac.getData();
    ac.displayData();
    ac.name = "Yed";
    ac.noTel = "0195750868";
    ac.age = 20;
    ac.setNoIC("020519-01-6431"); // tak boleh tukar kerana private access modifier
    ac.displayData();
    
    } // end of main method
} // end of class Test
