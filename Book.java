class BookModel{
    String title, author;
    int price;

    BookModel(){
        title = "Secret";
        author = "Braile Reynolds";
        price = 10000;
    }

    //Two parameters Constructor
    BookModel(String title, String author){
        this.title = title;
        this.author = author;
        price = 19999;
    }

    //Three parameters Constructor
    BookModel(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printDetails(){
        System.out.println("The Title of the Book is: " + title);
        System.out.println("The Author is: " + author);
        System.out.println("The price of the Book is: " + price + "\n");

    }
}

public class Book{
    public static void main(String args[]){
        BookModel b1 = new BookModel();
        b1.printDetails();

        BookModel b2 = new BookModel("Tens Of Happines", "S. J. Janaki");
        b2.printDetails();

        BookModel b3 = new BookModel("Art of Laziness" , "James Cooper", 2456);
        b3.printDetails();
    }
}
