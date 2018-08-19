package Patterns.Pattern_Decorator;

public class TestWearHero {
    public static void main(String[] args) {
        IRobeAble hero1 = new WearBasicArmor();
        System.out.println(hero1.getClothes() + " - " + hero1.getProtectionLevel());
        hero1 = new WearHelmetDecorator(hero1);
        System.out.println(hero1.getClothes() + " - " + hero1.getProtectionLevel());
        hero1 = new WearChestDecorator(hero1);
        System.out.println(hero1.getClothes() + " - " + hero1.getProtectionLevel());
    }
}
