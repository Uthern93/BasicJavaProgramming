
public class StringDemo {
   
    public static void main (String [] args) {
        String s = new String();
        System.out.println(s);
        s = "Thazliah";
        System.out.println(s);
        
        char arr[]= {'W','E','L','C','O','M','E'};
        String s1  = new String(arr);
        System.out.println(s1);
        
        String s2= new String (s1);
        System.out.println(s2);
        
        String s3= "I Lovr my country";
        System.out.println(s3);
    }
}
