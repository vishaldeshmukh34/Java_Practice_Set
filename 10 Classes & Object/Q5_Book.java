class Q5_Book {
    public String title;
    public String author;
    public String language;
    public void showBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Language: " + language);
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        Q5_Book b1 = new Q5_Book();
        Q5_Book b2 = new Q5_Book();
        b1.title = "Java Basics";
        b1.author = "James Gosling";
        b1.language = "English";
        b2.title = "Learn Coding";
        b2.author = "Vishal Deshmukh";
        b2.language = "English";
        b1.showBookInfo();
        b2.showBookInfo();
    }
}