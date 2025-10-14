public class Car {
    private int speed;

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) {
        if(speed >= 0 && speed <= 200) this.speed = speed;
        else System.out.println("Invalid speed! Must be between 0 and 200 km/h.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(150);
        car.setSpeed(250); // invalid
        System.out.println("Speed: " + car.getSpeed());
    }
}
