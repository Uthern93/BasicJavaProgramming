public class ArithmetricException_Demo {
    public static void main(String[] args) {
    try {
        int a= 30, b = 3;
        int c = a/b;
        System.out.println("Result = "+ c);
    }
    catch(ArithmeticException e){
        System.out.println("Can't divide a number by 0");
    }
}
}
