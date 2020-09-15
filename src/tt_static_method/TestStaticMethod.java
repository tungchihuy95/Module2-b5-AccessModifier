package tt_static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // calling change() method through Classname: Student

        //create Objects
        Student student1 = new Student(001, "Tung");
        Student student2 = new Student(002, "Chi");
        Student student3 = new Student(003, "Quynh");

        //calling display method
        student1.display();
        student2.display();
        student3.display();
    }
}
