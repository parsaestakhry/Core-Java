package tools;


public class Hello {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getMarks());
    }
}


// protected: only accessible within the same package or by subclasses
// default: only accessible within the same package