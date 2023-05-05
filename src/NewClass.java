public class NewClass {
   public static void main(String[] args) {
    try{
        int a[]=new int[5];
        a[6]=9;//accessing 7th element in an array of size 5
        System.out.println(a[6]);
    }catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array Index is out of Bounds");
    }
}
 
}
