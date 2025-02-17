class A {
    public void show() {
        System.out.println("A");
    }

    public A() {
        System.out.println("Constructor A");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        // reference variable
        A a = new A();

        new A(); // anonymous object
        a.show();
        
    }
}
