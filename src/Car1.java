
public class Car1 {

    int Car_No;
    String Car_Model;
    String Rank;
}

class Car2 extends Car1 {

    Car2(int CarNo, String CarModel, String rank) {
        super.Car_No = CarNo;
        super.Car_Model = CarModel;
        super.Rank = rank;
        System.out.println("The Car Number is" + CarNo + "\n "
                + "and the car model is " + CarModel + " and the ranking is " + Rank);
    }
}

class test {

    public static void main(String[] args) {
        Car2 c1 = new Car2(8553, "Perodua Myvi", "1st");
    }
}
