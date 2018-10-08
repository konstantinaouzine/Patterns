package Patterns.Pattern_Composite;

public class Drone extends DroneComponent {
    private String name;
    private double price;
    private boolean is4K;

    public Drone(String name, double price, boolean is4K){
        this.name = name;
        this.price = price;
        this.is4K = is4K;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDrone4K(){
        return is4K;
    }

    public void print(){
        System.out.println(getName() + ", price - " + getPrice());
    }

    public void print4K_only(){
        if (is4K)
            System.out.println(getName() + ", price - " + getPrice());
    }
}
