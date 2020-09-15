package tt_static_method;


import java.awt.*;

public class Student {
    private int rollnum;
    private String name;
    private static String college = "BBDIT";

    //Constructor
    Student(int r, String n) {
        rollnum = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollnum + " " + name + " " + college);
    }


}
