public class car2 {//class declaration

    //variable declaration //instant variable
    public String model, color;
    private String plateNumber;
    public int seat, tire;

    //declare method
    public void drive() {
        System.out.println("car drive" + plateNumber);
    }//end of method drive

    public void speed() {
        System.out.println("car speeding");
    }//end of speed()

    public void stop() {
        System.out.println("car speeding");
    }//end of stop()

    public void reverse() {
        System.out.println("car reverse");
    }//end of reverse()

    public void forward() {
        System.out.println("car forward");
    }//end of forward()

    public String getPlateNumber() {//encapsulation
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {//encapsulation
        this.plateNumber = plateNumber;
    }
}//end of class car

class CarTest { //start of class testCar

    public static void main(String[] args) {//main method

        car2 c1 = new car2();//create object
        c1.drive();
        c1.reverse();
        c1.model = "perodua myvi";
        c1.color = "hitam";
        //c1.plateNumber="KER8553"//error kerana private
        c1.setPlateNumber("KER8553");//setter method for plateNumber
        c1.seat = 5;
        c1.tire = 4;
        c1.drive();//lepas bagi value baru panggil

    }//end of main method
}//end of class
