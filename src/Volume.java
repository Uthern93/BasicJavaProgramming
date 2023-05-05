/* Program to find the volume of Sphere, Cone and Cylinder using abstract class */

abstract class Volume{
    double r,h;
    abstract void vol();
}

class Sphere extends Volume{
    void vol(){
        System.out.println("The volume of Sphere is " + (4.0/3.0*3.14*r*r*r));
    }
}

class Cylinder extends Volume{
    void vol(){
        
        System.out.println("The volume of Cylinder is " + (3.14*r*r*h));
    }
}

class Cone extends Volume
{
 void vol()
 {
  System.out.println("The volume of Cone is " + (1.0/3.0*3.14*r*r*h));
 }
}

class Abst
{
 public static void main(String args[])
 {
  Sphere obj1=new Sphere();
  obj1.r=10;
  obj1.vol();
  Cylinder obj2=new Cylinder();
  obj2.r=10;
  obj2.h=6;
  obj2.vol();
  Cone obj3= new Cone();
  obj3.r=10;
  obj3.h=6;
  obj3.vol();
 }
}