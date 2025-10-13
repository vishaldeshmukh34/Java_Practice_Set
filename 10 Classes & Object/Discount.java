// 7. Create a class Product with variables name, price, and discountPercent.
// Add a method calculateDiscountPrice() that returns price after discount.
// In main(), create 2 product objects and display their final prices.

public class Discount {
    
    String product;
    int price;
    int discount;
    
    // Method to calculate discounted price
    public double calculateDiscountPrice() {
        double finalPrice = price - (price * discount / 100.0);
        return finalPrice;
    }
    
    // Method to show details
    public void showDetails() {
        System.out.println("Product :- " + product);
        System.out.println("Price   :- " + price);
        System.out.println("Discount:- " + discount + "%");
        System.out.println("Final Price :- " + calculateDiscountPrice());
        System.out.println("________________________");
    }
    
    public static void main(String[] args) {
        Discount p1 = new Discount();
        p1.product = "Laptop";
        p1.price = 50000;
        p1.discount = 10;
        p1.showDetails();
        
        Discount p2 = new Discount();
        p2.product = "Mobile";
        p2.price = 20000;
        p2.discount = 15;
        p2.showDetails();
    }
}
