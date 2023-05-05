
public class EqualsDemo {
    public static void main(String[] args) {
        String s1="Equal";
        String s2="Equal";
        String s3="Not Equal";
        
        boolean b1 = s1.equals(s2);
        System.out.println("Both Strings are equal: "+b1);
        
        boolean b2 = s1.equals(s3);
        System.out.println("Both Strings are equal: "+b2);
    }
 
}
