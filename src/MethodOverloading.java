
public class MethodOverloading {

    String book_name;
    int noPages;

    void MethodOverloading() {
        System.out.println("Ini Constructor");
    }

    void read() {
        System.out.println("Ini Method read() pertama");
    }

    void read(String book, int page) {
        book_name = book;
        noPages = page;
        System.out.println("Ini Method read() kedua");
        System.out.println("Book name : " + book_name + " " + "number of pages : " + noPages);
    }

    void read(int page, String book) {
        book_name = book;
        noPages = page;
        System.out.println("Ini Method read() ketiga");
        System.out.println("Book name : " + book_name + " " + "number of pages : " + noPages);
    }

    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        m1.read();
        m1.read("Harry Potter", 25);
        m1.read(35, "Pirate of Carribean");
    }
}
