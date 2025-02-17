class Student {
    int rollno;
    String name;
    int marks;

}


public class Demo {
    public static void main(String[] args) {
        int nums[] = new int[4];
        Student student = new Student();
        student.rollno = 1;
        student.name = "John";
        student.marks = 90;

        Student student2 = new Student();
        student2.rollno = 2;
        student2.name = "Jane";
        student2.marks = 80;

        Student student3 = new Student();
        student3.rollno = 3;
        student3.name = "Doe";
        student3.marks = 70;


        Student[] students = new Student[3];
        students[0] = student;
        students[1] = student2;
        students[2] = student3;
       
        
        


        for (Student s : students) {
            System.out.println(s.rollno);
            System.out.println(s.name);
            System.out.println(s.marks);
            System.out.println("************");
        }
        

        String name = new String("Snake");
        System.out.println(name.charAt(2));

    }
}
