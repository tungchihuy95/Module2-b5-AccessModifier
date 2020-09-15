package bt_access_modifier;

import org.w3c.dom.css.CSSImportRule;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        circle.setRadius(3);
        System.out.println("radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());

    }
}
