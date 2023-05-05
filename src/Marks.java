
public class Marks {
   int Mark1, Mark2, Mark3;
   int sum;
   }

class Total extends Marks {
    
    void Calc(int Mark1, int Mark2, int Mark3) {
        super.Mark1=Mark1;
        super.Mark1=Mark2;
        super.Mark1=Mark3;
        System.out.println (Mark1+Mark2+Mark3);
    }
}
class Display {
    public static void main(String[] args) {
    Total t1 = new Total();
    t1.Calc(20,30,60);    
    }
}
