package Patterns.Pattern_TemplateMethod;

public class Protoss extends Race {
    @Override
    void move() {
        System.out.println("Moving to position using levitation");
    }

    @Override
    void build() {
        System.out.println("Using universe energies to build a construction");
    }
}
