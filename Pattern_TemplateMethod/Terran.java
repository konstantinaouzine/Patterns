package Patterns.Pattern_TemplateMethod;

public class Terran extends Race {
    @Override
    void move() {
        System.out.println("Moving to position using legs");
    }

    @Override
    void build() {
        System.out.println("Building a construction using regular building elements");
    }
}
