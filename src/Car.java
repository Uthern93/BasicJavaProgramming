public class Car { //Start of Class Car Declaration

    //Declare Variables //instant variables
    public String model, color;
    private String plateNumber; //encapsulation
    public int seat, tire;

    public String getPlateNumber() { //encapsulation
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) { //encapsulation
        this.plateNumber = plateNumber;
    }

    
    
    //Declare Method
    public void drive() { //Start of method drive
        System.out.println("I am driving the car" +plateNumber +" " +color);
    }//end of method drive

    public void speed() { //Start of method speed
        System.out.println("I am speeding the car");
    }//Stop of method speed

    public void stop() { //Start of method stop
        System.out.println("I am stopping the car");
    }//Stop of method stop

    public void reverse() { //Start of method reverse
        System.out.println("I am reversing the car");
    }//Stop of method reverse

    public void forward() { //Start of method forward
        System.out.println("I am forward the car");
    }//Stop of method forward

}// end of class Car

class testCar { //Start of class testCar

    //Main Method
    public static void main(String[] args) {
        Car c1=new Car();
        c1.reverse();
        c1.model="Perodua Myvi";
        c1.color="Hitam";
        c1.seat=5;
        c1.drive();
        c1.setPlateNumber("KER8553");// setter method
        
        Car c2=new Car();
        c2.reverse();
        c2.model="Perodua Myvi";
        c2.color="Hitam";
        c2.seat=5;
        c2.drive();
        c2.setPlateNumber("NAJIHA123");// setter method
    } //end of main method
} //end of class testCar
