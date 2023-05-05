class Sum {
    int n;
    void add (int num) {
        int result = 0;
        this.n=num;
        for (int i = 1; i<=n; i++)
            result = result + i;
        System.out.println("The sum is " + result);      
    }
}
class Even extends Sum {
    void add (int num)
    {
        int result = 0;
        this.n = result;
        for (int i=2; i<=n; i+=2)
            result = result + i;
        System.out.println("The sum is "+result);
    }
}
public class MtdOvrd {
    public static void main (String[]args){
    Sum obj1 = new Sum();
    Even obj2 = new Even();
    obj1.add(10);
    obj2.add(10);  
    }

}