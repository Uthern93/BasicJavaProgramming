
public class BookA { //Start of class

    BookA(String bname, String aname, int nopages) { //start of constuctor
        String book_name = bname;
        String author_name = aname;
        int no_of_pages = nopages;
        System.out.println("The output :" + book_name + " " + author_name + " " + no_of_pages);
    } //end of constructor

    public static void main(String[] args) { //Start of main method
        BookA b1 = new BookA("Java 2", "Herbert Scgildt", 100);
    } //end of main method
} //end of class
