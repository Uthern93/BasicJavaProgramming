//Uthern
package tuition;
import java.util.Scanner;

abstract class Tuisyen { //abstract class declaration
    
    //encapsulate variable 
    private static String name ,ic ,address;
    private static int age;
    
    //public scanner object
    static Scanner sc  =new Scanner (System.in);
     
    public  String getName(){
        return name;
    }
    
    public  static int  getAge(){
        return age;
    }
    
    public  String getAddress(){
        return address;
    }
public  String getIC(){
        return ic;
}

public void setName (String name){
    this.name=name;
}
public void setAge(int age){
    this.age=age;
}

public void setAddress(String address){
    this.address=address;
}
public void setIc(String ic){
    this.ic= ic;  
}

//main method
public static void main(String []args){
   
   System.out.print("\n **********************************************************");
    
   System.out.print("\n ***Selamat Datang Ke Sistem Pendaftaran Tuisyen Bestari ***");
   
   System.out.print("\n **********************************************************");
   
   Register reg= new Register();
   reg.data();
   
   Subject sub= new Subject ();
   System.out.println("\nPilihan subjek akan berulang sebanyak 4 kali sahaja !!!!"  );
   
   sub.data();
   
   reg.display();
}
}


