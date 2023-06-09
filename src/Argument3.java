
public class Argument3 {

    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException nfe) {
                System.err.println("One of the command-line " + "arguments is not an integer.");

            }
            System.out.println("Sum = " + sum);
        }
    }
}
