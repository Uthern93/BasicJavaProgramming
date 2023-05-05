class Addition {
    float num1, num2, total;
    void calculate (float x, float y) {
        num1=x;
        num2=y;
        total=num1+num2;
        System.out.println("The total of Addition is "+total);
    }
}
class Subtraction extends Addition {
    void calculate (float x, float y) {
        num1=x;
        num2=y;
        total=num1-num2;
        System.out.println("The total of Subtraction is "+total);
    }
}
class Multiplication extends Addition {
    void calculate (float x, float y) {
        num1=x;
        num2=y;
        total=num1*num2;
        System.out.println("The total of Multiplication is "+total);
    }
}
class Division extends Addition {
    void calculate (float x, float y) {
        num1=x;
        num2=y;
        total=num1/num2;
        System.out.println("The total of Division is "+total);
    }
}
public class Calculator {
    public static void main(String[] args) {
        Addition a1=new Addition();
        Subtraction b1=new Subtraction();
        Multiplication c1=new Multiplication();
        Division d1=new Division();
        a1.calculate(5, 2);
        b1.calculate(5, 2);
        c1.calculate(5, 2);
        d1.calculate(5, 2);
        
    }
}