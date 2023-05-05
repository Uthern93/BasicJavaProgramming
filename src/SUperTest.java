
class Food { //super class

    Food() {
        System.out.println("Food Constructor executed");
    }

}

class Burger extends Food { //subclass 1

    public Burger() {
        super();
    }
}
class Pizza extends Food { //subclass 2

    public Pizza() {
        super();
    }
}

public class SUperTest {

    public static void main(String[] args) {
        Burger b1 = new Burger(); 
        Pizza p1=new Pizza();
    }
}
