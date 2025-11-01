// File name: PrivateExample.java
class PrivateExample {
    private int data = 100;

    private void display() {
        System.out.println("Private data: " + data);
    }

    public void show() {
        display(); // allowed inside same class
    }
}
