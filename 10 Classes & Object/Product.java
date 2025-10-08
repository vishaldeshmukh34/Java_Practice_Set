// Q7. Create a class Product with variables name, price, and discountPercent.
class Product {
    String name;
    double price;
    double discountPercent;

    double calculateDiscountPrice() {
        double discountAmount = price * discountPercent / 100;
        return price - discountAmount;
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Laptop";
        p1.price = 50000;
        p1.discountPercent = 10;

        Product p2 = new Product();
        p2.name = "Mobile";
        p2.price = 20000;
        p2.discountPercent = 5;

        System.out.println(p1.name + " Final Price: " + p1.calculateDiscountPrice());
        System.out.println(p2.name + " Final Price: " + p2.calculateDiscountPrice());
    }
}
