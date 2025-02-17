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
       
        
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rollno);
            System.out.println(students[i].name);
            System.out.println(students[i].marks);
            System.out.println("************");
        }

    }
}
