class Human {
    // private: access modifier means that the field is only accessible within the
    // same class
    // to accsess the field, we need to create a public method in the same class
    // instance variables
    private int age;
    private String name;

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
        Human human = new Human();
        System.out.println(human.getAge() + " " + human.getName());

    }
}
