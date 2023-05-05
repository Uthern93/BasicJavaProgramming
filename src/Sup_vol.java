//To find the volume of sphere and Cylinder

class Sphere {

    double r;

    Sphere(double r) {
        this.r = r;
    }

    void sph() {
        System.out.println("The volume of sphere is " + (4.0 / 3.0 * 3.14 * r * r * r));
    }
}
// To find volume cylinder

class Cylinder extends Sphere {

    double h;

    Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    void volume() {
        super.sph();
        System.out.println("The volume of cylinder is " + (3.14 * r * r * h));
    }
}

class Sup_vol{
    public static void main(String[]args){
        Sphere obj1=new Sphere(5.0);
        Cylinder obj2=new Cylinder(3.0,6.0);
        System.out.println("From object1: ");
        obj1.sph();
        System.out.println("From object2: ");
        obj2.volume();
    }
}
