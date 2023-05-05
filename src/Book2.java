public class Book2 { //Start of class
    String book_name;
    String author_name;
    int no_of_pages;
    void getData(String bname, String aname, String nopages)
    {
        book_name=bname;
        author_name=aname;
        no_of_pages=Integer.parseInt(nopages);
    }
    void displayData()
    {
        System.out.println("Book Name : "+book_name);
        System.out.println("Author Name : "+author_name);
        System.out.println("Number Of Pages : "+no_of_pages);
    }
    public static void main (String[]args){
        Book2 b1= new Book2();
        Book2 b2=b1;
        b1.getData("Java 2 A Beginner's Guide", "Herbert Schildt", "100");
        b1.displayData();
        System.out.println("------------------This is b2 object------------------");
        b2.getData("Java for Pro", "Adam Smith", "185");
        b2.displayData();
    }
} // End of class
