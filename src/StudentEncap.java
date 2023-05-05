//Start of class / class declaration
public class StudentEncap { 
    
    // variable declaration
    private String name;
    private int age;
    private String noIC;
    private char bloodType;

    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNoIC() {
        return noIC;
    }

    public char getBloodType() {
        return bloodType;
    }

    //setter
    public void setName(String Name) {
        this.name = Name;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public void setNoIC(String NoIC) {
        this.noIC = NoIC;
    }

    public void setBloodType(char BloodType) {
        this.bloodType = BloodType;
    }
} // end of class

class StudentTest { // Start of class StudentTest
    public static void main(String[]args){ // start of main method
    StudentEncap s1 = new StudentEncap(); // Create Object
    
    s1.setName("Uthern");
    System.out.println("Name : "+s1.getName());
    
    s1.setAge(22);
    System.out.println("Your Age : "+s1.getAge() );
    
    s1.setNoIC("001001020703");
    System.out.println("Your IC is : "+s1.getNoIC());
    
    s1.setBloodType('O');
    System.out.println("Bloodtype : "+s1.getBloodType());
    } // end f main method
}// End of STudentTest
