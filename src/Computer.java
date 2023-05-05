public class Computer {
    String brand;
    double price;
    String color;
    
    Computer(){
        brand="All Brand";
        price = 1000.00;
        color = "black";
        System.out.println("Computer brand is "+brand+" and the pirce is RM"+price+" and it come in color "+color);
    }
    Computer(String cbrand, double cprice, String ccolor){
        brand = cbrand;
        price = cprice;
        color = ccolor;
        System.out.println("Computer brand is "+brand+" and the pirce is RM"+price+" and it come in color "+color);
    }
    public static void main(String[]args) {
        Computer c1 = new Computer();
        Computer c2 = new Computer("Lenovo",2000.55,"black");
    }
}
