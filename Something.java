class Human {
    // private: access modifier means that the field is only accessible within the same class
    // to accsess the field, we need to create a public method in the same class
    private int age = 20;
    private String name = "John";
    // public: access modifier means that the method is visible and can be called from other objects of other types
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
public class Something {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getAge());
        System.out.println(human.getName());
        human.setAge(30);
        System.out.println(human.getAge());
        
    }
}
