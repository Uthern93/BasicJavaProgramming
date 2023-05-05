//uthern


class Student {

    String koko;

}

class DPR extends Student {

    void Mainkoko(String a) {
        koko = a;

        System.out.println("Student DPR ambil koko" + " : " + koko);
    }
}

class DET extends Student {

    void Mainkoko(String a) {

        koko = a;

        System.out.println("Student DET ambil koko" + " : " + koko);
    }
}

class DKA extends Student {

    void Mainkoko(String a) {
        koko = a;

        System.out.println("Student DKA ambil koko" + " : " + koko);
    }
}

public class Student_Koko {

    public static void main(String[] args) {
        DPR a1 = new DPR();
        DET b1 = new DET();
        DKA c1 = new DKA();
        a1.Mainkoko("Badminton");
        b1.Mainkoko("Takraw");
        c1.Mainkoko("Bola Sepak");

    }
}
