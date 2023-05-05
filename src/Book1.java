class Book1 {

    String book_name;
    String author_name;

    void getdata() {
        ////boleh guna input
        book_name = "java for beginner";
        author_name = "Aiman Aliff";
    }

    void getdata(String bName, String aName) {
        book_name = bName;
        author_name = aName;
    }

    void displayData() {
        System.out.println("Book Name: " + book_name);
        System.out.println("Author Name: " + author_name);
    }

    public static void main(String[] args) {//main method
        Book1 b1 = new Book1();//create object
        Book1 b2 = b1;
        b1.getdata();
        b1.displayData();
        b1.getdata("java for advance", "Uthern Smith");
        b1.displayData();
    }
}