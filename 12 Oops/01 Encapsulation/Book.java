public class Book {
    private String title;
    private String author;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Programming");
        b.setAuthor("Herbert Schildt");
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
    }
}
