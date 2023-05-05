class Student {
    String food,alat1, alat2;
    void makan (String makan) {
        food=makan;
    }
}
class DDT extends Student {
    void makan (String makan, String a, String b) {
        food=makan;
        alat1=a;
        alat2=b;
        System.out.println("Student DDT makan "+food+" : "+alat1+" "+alat2);
    }
}
class DEM extends Student {
    void makan (String makan, String a, String b) {
        food=makan;
        alat1=a;
        alat2=b;
        System.out.println("Student DEM makan "+food+" : "+alat1+" "+alat2);
    }
}
class DKA extends Student {
    void makan (String makan, String a, String b) {
        food=makan;
        alat1=a;
        alat2=b;
        System.out.println("Student DKA makan "+food+" : "+alat1+" "+alat2);
    }
}
public class TestStudent {
    public static void main(String[] args) {
        DDT a1=new DDT();
        DEM b1=new DEM();
        DKA c1=new DKA();
        a1.makan("steak","Pisau", "Garfu");
        b1.makan("Mee","Sudu", "Garfu");
        c1.makan("kuetiew","chopstick", "Sudu");
    }
}