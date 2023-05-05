public abstract class Student3 {
  String food;
  String alatmakan;
  abstract void makan (); //Abstract class does not have body {}
}  
  
class DDT1 extends Student3 {
     void makan ( String a , String b ){
     food = a ;
     alatmakan = b;
     System.out.println ("Student DEM makan  " + food + " : " + alatmakan );
    }   
}
class DEM1 extends Student3 {
    void makan ( String a , String b ){
          food = a ;
          alatmakan = b;
        System.out.println ("Student DEM makan  " + food + " : " + alatmakan );
    }
}


class DKA1 extends Student3 {
    void makan ( String a , String b ){
          food = a ;
          alatmakan = b;
        System.out.println ("Student DKA makan  " + food + " : " + alatmakan );
    }
}

 class eat{
    public static void main (String [] args){
        /* Student3 s1 = new Student3();
        Abstract clas cannot be instantiated */ 
 
        Student3 a1 = new DDT1 ();
        Student3 b1 = new DEM1();
        Student3 c1 = new DKA1();
        //s1.makan ("Makanan" , "Tangan");
        a1.makan("Steak", "Pisau Garfu");
        b1.makan("Mee " , " Sudu Garfu");
        c1.makan("Kuetiew" , " Chopstick Sudu");
        
    }
 }
