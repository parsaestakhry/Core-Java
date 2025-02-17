public class Hello {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Calculator calculator = new Calculator();
        // method overloading
        int sum = calculator.add(1, 4, 5);
        String result = computer.getMeAPen(1);
        System.out.println(result);
        computer.playMusic();
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