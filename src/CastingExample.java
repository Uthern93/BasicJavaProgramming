public class CastingExample {
    public static void main (String[]args){
   //widening a type
    int num1 = 10;
    double num2 = num1;
    System.out.println("\nnum1 : " +num1 +"\t &num2: " +num2);
    
    System.out.println("---------------------------------------");
    
    //narrowing a type
    double num3 = 333.14159;
    int num4 = (int)num3;
    System.out.println("\nnum3 : " +num3 +" & num3: " +num4);
    System.out.println(1/2);
    
    System.out.println("---------------------------------------");
    float a=3+2;
    float b=3-2;
    float c=3*2;
    float d=3/2;
    float e=3%2;
    
    System.out.println("a = "+a +" b = " +b +" c = " +c +" d = " +d +" e = " +e);
    
    System.out.println("---------------------------------------");
    int f= 0,g= 0,h= 0,i= 0,j=0;
    f += 5;
    g -= 5;
    h *= 5;
    i /= 5;
    j %= 5;
    
    System.out.println("f = "+f +" ,g = " +g +" ,h = " +h +"  ,i= " +i +" ,j = " +j);
    
    } //end of main()
} //end of class
