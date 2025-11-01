// File name: ProtectedExample.java
class Parent {
    protected void message() {
        System.out.println("I am Protected — subclass can access me!");
    }
}

class Child extends Parent {
    void show() {
        message();  // allowed
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
