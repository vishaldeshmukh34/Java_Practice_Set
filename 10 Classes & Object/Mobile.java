// Q10. Create a class Mobile with variables brand, price, and ramSize.
class Mobile {
    String brand;
    double price;
    int ramSize;

    void showSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("RAM: " + ramSize + "GB");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.price = 20000;
        m1.ramSize = 8;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 90000;
        m2.ramSize = 6;

        Mobile m3 = new Mobile();
        m3.brand = "OnePlus";
        m3.price = 40000;
        m3.ramSize = 12;

        m1.showSpecs();
        m2.showSpecs();
        m3.showSpecs();
    }
}
