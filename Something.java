class Human {
    // private: access modifier means that the field is only accessible within the
    // same class
    // to accsess the field, we need to create a public method in the same class
    // instance variables
    private int age;
    private String name;

    // constructor: a special method that is called when an object is instantiated what it does is to initialize the object of the class 
    // default constructor
    public Human()  {
        age = 34;
        name = "Snake";
    }

    

    // constructor overloading
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }


    


    public Human(String name) {
        this.age = 31;
        this.name = name;
    }



    // public: access modifier means that the method is visible and can be called
    // from other objects of other types
    // encapsulation: the field is private and can only be accessed through a public
    // method
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // age:local variable
    public void setAge(int age) {
        // this: keyword refers to the current object means that the field is assigned
        // the value of the parameter and not the other way around
        // we are specifying that the field is assigned the value of the parameter
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Something {
    public static void main(String[] args) {
        // everytime the object is created, the constructor is called
        Human human = new Human(24,"John");
        Human human2 = new Human();
        Human human3 = new Human("David");

        System.out.println(human2.getAge() + " " + human2.getName());
        System.out.println(human.getAge() + " " + human.getName());
        System.out.println(human3.getAge() + " " + human3.getName());

    }
}
