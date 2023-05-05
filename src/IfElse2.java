import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse2 {

    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your vaksin Dos value: ");
        //int dos = stdin.readLine();
        int dos = Integer.parseInt(stdin.readLine());
        System.out.print("Enter your gender: ");
        String gender = stdin.readLine();

        //char gender ='F';
        if (dos == 2) {
            if ( gender.equals("M")) {
                System.out.println("Sila ke asrama Lelaki");
            } else {
                System.out.println("Sila ke asrama perempuan");
            }
        } else {
            System.out.println("Sila pulang ke rumah untuk kelas online");
        }
    }

}
