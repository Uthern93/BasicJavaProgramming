
class Planet { //super class
    String shape; //instance variables
    double size; //instance variables
    double r; //instance variables
    
    void CalcSize() { //method CalcSize()
        size=(4.0 / 3.0 * 3.14 * r * r * r);
    }
}
class Earth extends Planet { // sub class
    String placement;
    
        Earth (String shape, double r, String planet) { //First Constructor
        super.r=r;
        super.shape=shape;
        this.placement=planet;
    }
        void info(double Oxygen, double Nitrogen, double CarbonD, double OtherGas) { //method info()
            System.out.println("Earth is a " + shape +" shaped planet in the solar system.");
            System.out.println("Earth is the " + placement +" planet from sun in the solar system.");
            System.out.println("Earth's atmosphere is composed of about "+Nitrogen+" percent nitrogen,\n"
                    +Oxygen+ " percent oxygen,"+CarbonD+ " percent carbon dioxide"+OtherGas+ " percent other gases.");
        }
        
        void volume() {
        super.CalcSize();
        System.out.println("The size of planet Earth is " + super.size+" cubic kilometers");
    }
}

class Planet_calc {
    public static void main(String[]args){
        Earth obj1=new Earth("Sphere", 5.0, "third"); // create new object and call constructor
        System.out.println("From object1: "); //display output
        obj1.info(21.0, 78.0, 0.04, 0.96 ); //object call method info
        obj1.volume(); // object call method volume
    }
}
