
public class Employee {
    String employeeName;
    String employeeDept;
    int employeeID;
    
    void attendOffice(){
        System.out.println("I attend the office");
        System.out.println(employeeID);
        System.out.println(employeeName);
        System.out.println(employeeDept);
    }
    public static void main (String[]args) {
        Employee e1=new Employee();
        e1.attendOffice();
        
        e1.employeeName="Siti";
        e1.employeeID=101;
        e1.employeeDept="JTMK";
        e1.attendOffice();
    }//end of main method
}//end of class
