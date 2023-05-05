//Uthern
package tuition;

public class Register extends Tuisyen {

    static Tuisyen obj1 = new Register();

    public static void data() {
        System.out.println("\nEnter Student Name:");
        obj1.setName(sc.nextLine());

        System.out.println("Enter Student Ic : ");
        obj1.setIc(sc.nextLine());

        System.out.println("Enter Student Age :");

        try {
            String age = sc.nextLine();
            obj1.setAge(Integer.parseInt(age));

        } catch (NumberFormatException nfe) {
            System.err.println("Masukkan Number sahaja !!!!");
            sc.close();

        }
        System.out.println("Enter Student Address :");
        obj1.setAddress(sc.nextLine());
    }

    public void display() {
        System.out.println("\nDetails Student ");
        System.out.println("\nStudent Name:" + obj1.getName());
        System.out.println("\nStudent IC :" + obj1.getIC());
        System.out.println("\nStudent Age :" + obj1.getAge());
        System.out.println("\nStudent Address" + obj1.getAddress());
    }
}
