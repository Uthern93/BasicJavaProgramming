abstract class Arithmetric 
{
    int a, b;
    abstract void calc();
}

class Add extends Arithmetric 
{
    void calc()
    {
        System.out.println("The sum is "+(a+b));
        
    }
}
class Sub extends Arithmetric 
{
    void calc()
    {
        System.out.println("The difference is "+(a-b));
        
    }
}
class Abst
{
    public static void main (String[]args){
        Add obj1=new Add();
        obj1.a=10;
        obj1.b=6;
        obj1.calc();
        
        Sub obj2=new Sub();
        obj2.a=10;
        obj2.b=6;
        obj2.calc();
    }
}