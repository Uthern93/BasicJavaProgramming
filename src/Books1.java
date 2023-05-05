class Books2 {

    int bookQuantity;
    float bookPrice;
    double totalBookPrice, discountRate;
    String custName, bookCategory, bookName;

    void getInput(String n, String c, String m, int q, float p, double b) {
        custName = n;
        bookCategory = c;
        bookName = m;
        bookQuantity = q;
        bookPrice = p;
        totalBookPrice = b;
        System.out.println("Customer's name:  " + custName + " Book category:  " + bookCategory
                + " Book name:  " + bookName + " Book quantity:  " + bookQuantity + " Total book price: " + totalBookPrice);
    }

    void calculatePriceAfterDisccount() {
        if (bookQuantity > 20);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);

        if (bookQuantity > 20);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);

        if (bookQuantity > 30);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);
    }

}

class Fantasy extends Books2 {

    void getInput(String n, String c, String m, int q, double b) {
        custName = n;
        bookCategory = c;
        bookName = m;
        bookQuantity = q;
        totalBookPrice = b;
        System.out.println("Customer's name:  " +  custName +"\n" + " Book category:  " + bookCategory
                + "\n" +  " Book name:  " + bookName + "\n" +  " Book quantity:  " + bookQuantity + "\n" + " Total book price: " +totalBookPrice+ "\n" +"=========================================================="  );
    }

    void calculatePriceAfterDisccount() {
        if (bookQuantity > 20);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);
        System.out.println(" The total book price is: " + totalBookPrice);

        if (bookQuantity > 20);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);

        if (bookQuantity > 30);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);
    }
}

class Education extends Books2 {

    void getInput(String n, String c, String m, int q, double b) {
        custName = n;
        bookCategory = c;
        bookName = m;
        bookQuantity = q;
        totalBookPrice = b;
        System.out.println("Customer's name:  " + custName +"\n" +  " Book category:  " + bookCategory
                + " Book name:  " + bookName +"\n" +  " Book quantity:  " + bookQuantity + "\n" +  " Total book price: " + totalBookPrice + "\n" +"==========================================================" );
    }

    void calculatePriceAfterDisccount() {
        if (bookQuantity > 20);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);

        if (bookQuantity > 20);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);
        System.out.println(" The total book price is: " + totalBookPrice);

        if (bookQuantity > 30);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);
    }
}

class References extends Books2 {

    void getInput(String n, String c, String m, int q, double b) {
        custName = n;
        bookCategory = c;
        bookName = m;
        bookQuantity = q;
        totalBookPrice = b;
        System.out.println("Customer's name:  " + custName + "\n" + " Book category:  " + bookCategory
                + "\n" + " Book name:  " + bookName + "\n" + " Book quantity:  " + bookQuantity + "\n" + " Total book price: " + totalBookPrice +"\n" +"==========================================================" );
    }

    void calculatePriceAfterDisccount() {
        if (bookQuantity > 20);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);

        if (bookQuantity > 20);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);

        if (bookQuantity > 30);
        totalBookPrice = bookPrice * bookQuantity * (100 % -discountRate);
        System.out.println(" The total book price is: " + totalBookPrice);
    }
}

class BookStore {

    public static void main(String[] args) {
        Books2 a1 = new Books2();
        Fantasy b1 = new Fantasy();
        Education c2 = new Education();
        References d3 = new References();
        b1.getInput("Aminah,", "Fantasy,", "Harry Potter S1,", 25, 980.00);
        c2.getInput("Hassan,", "Education,", "Professional C++,", 40, 2640.00);
        d3.getInput("Siti,", "References,", "Oxford Dictionary,", 15, 600);
    }
}
