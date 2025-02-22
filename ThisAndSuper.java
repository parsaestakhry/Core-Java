public class ThisAndSuper {
    public static void main(String[] args) {

        // SuperB b = new SuperB();
        SuperB b2 = new SuperB(5);

    }
}

class SuperA {

    public SuperA() {
        System.out.println("Hello from A");
    }
}

class SuperB extends SuperA {
    public SuperB() {
        super();
        System.out.println("hello from B");
    }

    public SuperB(int b) {
        this();
        System.out.println("hello from B with int");
    }

}