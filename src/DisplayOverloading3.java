// Uthern

public class DisplayOverloading3 {

    public void disp(char c, int num) {
        System.out.println(c + " " + num);
    }

    public void disp(int num, char c) {
        System.out.println(num + " " + c);
    }
}

class sample3 {

    public static void main(String[] args) {
        DisplayOverloading3 obj = new DisplayOverloading3();
        obj.disp('a', 100);
        obj.disp(100, 'a');
    }
}
