public class ConstructorOverloading {
    String name, no_matric;
    int age;
    
    ConstructorOverloading(){
        name="Uthern";
        no_matric="03DDT20F2011";
        age=22;
        System.out.println("Data saya adalah "+name+" "+no_matric+" "+age);
    }
    ConstructorOverloading(String aname, String smatric, int sage){
        name=aname;
        no_matric=smatric;
        age=sage;
        System.out.println("friend's Data "+name+" "+no_matric+" "+age);
    }
    public static void main(String[]args){
        ConstructorOverloading s1 = new ConstructorOverloading();
        ConstructorOverloading s2 = new ConstructorOverloading("adami","03DDT20F2040",24);
    }
}
