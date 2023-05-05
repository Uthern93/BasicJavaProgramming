
public class Sphere {

    double r;

    double sph() {
        return 4.0 / 3.0 * 3.14 * r * r * r;
    }
}
// To find the volume cylinder

class Cylinder extends Sphere {

    double h;

    double cylin() {
        return 3.14 * r * r * h;
    }
}

class Shape1 {

    public static void main(String[] args) {
        double result;
        Sphere obj1 = new Sphere();
        Cylinder obj2 = new Cylinder();
        obj1.r = 5.0;
        result = obj1.sph();
        System.out.println("The volume of Sphere from obj1 is " + result + " Cu.Units");
        obj2.r = 3.0;
        result = obj2.sph();
        System.out.println("The volume of Sphere from obj2 is " + result + " Cu.Units");
        obj2.h = 6.0;
        result = obj2.cylin();
        System.out.println("The volume of Cylinder from obj2 is " + result + " Cu.Units");
    }
}
