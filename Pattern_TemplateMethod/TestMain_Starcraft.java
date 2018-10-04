package Patterns.Pattern_TemplateMethod;

public class TestMain_Starcraft {
    public static void main(String[] args) {
        Race terran = new Terran();
        Race protoss = new Protoss();
        terran.createBuilding();
        System.out.println("----------------------");
        protoss.createBuilding();
    }
}
