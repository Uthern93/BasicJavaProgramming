//Lab Task 3, Uthern A/L Sutin, 03DDT20F2011, DDT3A

public class Books {

    int bookQuantity;
    String custName, bookCategory;
    double bookPrice;
    double totalBookPrice = 0;

    void getInput() {
        custName = "Name";
        bookCategory = "Book Category";
        bookQuantity = 0;
        System.out.println("Customer Name :" + custName + " Book Category :" + bookCategory + " Quantity Purchased :" + bookQuantity);
    }

    void calculatePriceAfterDiscount() {

        System.out.println("Total Book Price : RM " + totalBookPrice+"\n" + "==========================================================");
    }
}

class Fantasy extends Books {

    void getInput(String name, String category, int quantity) {
        this.custName = name;
        this.bookCategory = category;
        this.bookQuantity = quantity;
        System.out.println("Customer Name :" + custName + "\n" + "Book Category :" + bookCategory + "\n" + "Quantity Purchased :" + bookQuantity);
    }

    void calculatePriceAfterDiscount() {
        this.bookPrice = 56.0;
        if (bookQuantity > 20) {
            super.totalBookPrice = bookPrice * this.bookQuantity * 70 / 100;
        }else{
            super.totalBookPrice = bookPrice * this.bookQuantity;
        }
        System.out.println("Total Book Price : RM" + totalBookPrice + "\n" + "==========================================================");

    }
}

class Education extends Books {

    void getInput(String name, String category, int quantity) {
        this.custName = name;
        this.bookCategory = category;
        this.bookQuantity = quantity;
        System.out.println("Customer Name :" + custName + "\n" + "Book Category :" + bookCategory + "\n" + "Quantity Purchased :" + bookQuantity);
    }

    void calculatePriceAfterDiscount() {
        this.bookPrice = 120.0;
        System.out.println(bookQuantity);
        if (bookQuantity > 30) {
            super.totalBookPrice = bookPrice * this.bookQuantity * 50 / 100;
        }else{
            super.totalBookPrice = bookPrice * this.bookQuantity;
        }
        System.out.println("Total Book Price : RM" + totalBookPrice + "\n" + "==========================================================");
    }
}

class References extends Books {

    void getInput(String name, String category, int quantity) {
        this.custName = name;
        this.bookCategory = category;
        this.bookQuantity = quantity;
        System.out.println("Customer Name :" + custName + "\n" + "Book Category :" + bookCategory + "\n" + "Quantity Purchased :" + bookQuantity);
    }

    void calculatePriceAfterDiscount() {
        this.bookPrice=80.0;
        System.out.println(bookQuantity);
        if (bookQuantity > 20) {
            super.totalBookPrice = bookPrice * this.bookQuantity * 55 / 100;
        }else{
            super.totalBookPrice = bookPrice * this.bookQuantity;
        }
        System.out.println("Total Book Price : RM" + totalBookPrice + "\n" + "==========================================================");
    }
}

class TestBooks {

    public static void main(String[] args) {
        Books a1 = new Books();
        Fantasy b1 = new Fantasy();
        Education c1 = new Education();
        References d1 = new References();
        a1.getInput();
        a1.calculatePriceAfterDiscount();
        b1.getInput("Aminah", "Fantasy", 25);
        b1.calculatePriceAfterDiscount();
        c1.getInput("Hassan", "Education", 40);
        c1.calculatePriceAfterDiscount();
        d1.getInput("Siti", "references", 15);
        d1.calculatePriceAfterDiscount();
    }
}
