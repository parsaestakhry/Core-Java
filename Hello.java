public class Hello {
    // static: method belongs to the class and not an instance of the class
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.brand = "Samsung";
        mobile.price = 1000;
        mobile.network = "4G";
        Mobile mobile2 = new Mobile();
        mobile2.brand = "Apple";
        mobile2.price = 2000;
        mobile2.network = "5G";
        

    }
}

// oop
// property and a behavior is in a class
// class is a blueprint for an object
// object is an instance of a class

class Calculator {
    // public: access modifier means that the method is visible and can be called
    // from other objects of other types
    // int: return type means that the method returns an integer value
    // add: method name
    // (int num1, int num2): list of parameters means that the method accepts two
    // parameters, both of type int
    // { ... }: method body
    // return num1 + num2: return statement means that the method returns the sum of
    // the two parameters

    // local variable
    int num;
    public int add(int num1, int num2) {
        // instance variables
        return num1 + num2;
    }
    // method overloading

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // method overloading
    public double add(double num1, double num2) {
        return num1 + num2;
    }

}

class Computer {
    // void: return type means that the method does not return a value
    public void playMusic() {
        System.out.println("Playing music");
    }

    public String getMeAPen(int cost) {
        if (cost >= 2) {
            return "Pen";
        } else {
            return "No pen";
        }

    }
}


class Mobile {
    String brand;
    int price;
    String network;
    // static: the name property is shared by all instances of the Mobile class and if it is changed in one instance, it will be changed in all instances
    static String name;

    // will be called only once 
    // it is called first because 
    static {
        name = "";
        System.out.println("Static block");
    }

    // default constructor
    public Mobile() {
        brand = "";
        price= 200;
        network = "5G";
        name = "iPhone";
        System.out.println("Constructor");

    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Network: " + network);
        System.out.println("Name: " + name);
    }
    // cannot call instance methods from static methods or can not call non static methods directly from class 
    // only can use static variables inside static methods
    public static void showDetailsStatic() {
        System.out.println("Name: " + name);
    }
}