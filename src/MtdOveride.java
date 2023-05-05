class Centigrade 
{
    double f,c;
    void convert (double num)
    {
        this.f=num;
        c=(f-32.0)*5.0/9.0;
        System.out.println("The tempereature in centigrade is "+c);
    }
}
class Fahrenheit extends Centigrade 
{
    void convert (double num)
    {
        this.c=num;
        f=9.0/5.0*c+32.0;
        System.out.println ("the temperature in fahrenheit is "+f);
    }
}
public class MtdOveride 
{
    public static void main(String[] args) {
        Centigrade obj1=new Centigrade();
        Fahrenheit obj2=new Fahrenheit();
        obj1.convert(98);
        obj2.convert(36.66);
    }
}