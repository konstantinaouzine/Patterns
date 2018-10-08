package Patterns.Pattern_Composite;

public class Drone extends DroneComponent {
    private String name;
    private double price;

    public Drone(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void print(){
        System.out.println(getName() + ", price - " + getPrice());
    }
}
