// Q6. Create a class Car with variables model, brand, and mileage.
class Car {
    String model;
    String brand;
    double mileage;

    void showCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.model = "X5";
        c1.mileage = 12;

        Car c2 = new Car();
        c2.brand = "Mahindra";
        c2.model = "Thar";
        c2.mileage = 15;

        c1.showCarInfo();
        c2.showCarInfo();
    }
}
