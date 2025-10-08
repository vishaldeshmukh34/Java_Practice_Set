// Q5. Create a class Book with variables title, author, and price.
class Book {
    String title;
    String author;
    double price;

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "James Gosling";
        b1.price = 450;

        Book b2 = new Book();
        b2.title = "Python 101";
        b2.author = "Guido van Rossum";
        b2.price = 550;

        Book b3 = new Book();
        b3.title = "C++ Mastery";
        b3.author = "Bjarne Stroustrup";
        b3.price = 600;

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}
