
public class OccurStr {
    public static void main(String[] args) {
        String s = "Now it is a good time";
        int s1 = s.indexOf('t');
        System.out.println(s1+" ");
        
        int s2 = s.indexOf("it");
        System.out.println(s2+" ");
        
        int s3 = s.lastIndexOf('t');
        System.out.println(s3+" ");
        
        int s4 = s.lastIndexOf("it");
        System.out.println(s4+" ");
    }
 
}
