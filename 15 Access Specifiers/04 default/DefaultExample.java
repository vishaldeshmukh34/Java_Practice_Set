// File name: DefaultExample.java
class DefaultExample {
    void display() {  // default access
        System.out.println("I am Default — visible in same package only!");
    }

    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.display();
    }
}
