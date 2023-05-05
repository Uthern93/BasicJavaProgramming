
public class Pool {

    int width, depth, height;
}

class Volume extends Pool {

    void CalcVolume(int width, int depth, int height) {
        super.width=width;
        super.height=height;
        super.depth=depth;
        System.out.println(width * depth * height);
    }
}

class TestClass {
    public static void main(String[]args){
    Volume v1 = new Volume();
    v1.CalcVolume(23,34,45);
    }
}
