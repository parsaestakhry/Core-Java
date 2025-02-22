public class ThisAndSuper {
    public static void main(String[] args) {
    
        SuperB b = new SuperB();
    }
}


class SuperA {

    public SuperA() {
        System.out.println("Hello from A");
    }
}

class SuperB extends SuperA {
    public SuperB() {
        System.out.println("hello from B");
    }
}