package Patterns.Pattern_Decorator;

public class WearBasicArmor implements IRobeAble {
    private int protectionLevel;
    private String whatIWear;

    WearBasicArmor(){
        whatIWear = "BasicArmor";
        protectionLevel = 70;
    }

    @Override
    public int getProtectionLevel() {
        return protectionLevel;
    }

    @Override
    public String getClothes() {
        return whatIWear;
    }
}
