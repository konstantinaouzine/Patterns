package Patterns.Pattern_Decorator;

public class WearHelmetDecorator extends WearArmorDecorator {

    WearHelmetDecorator(IRobeAble iRobeAble) {
        this.iRobeAble = iRobeAble;
    }

    @Override
    public int getProtectionLevel() {
        return iRobeAble.getProtectionLevel() + 30;
    }

    @Override
    public String getClothes() {
        return iRobeAble.getClothes() + ", Helmet";
    }
}
