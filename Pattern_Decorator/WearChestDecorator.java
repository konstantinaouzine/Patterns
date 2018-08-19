package Patterns.Pattern_Decorator;

public class WearChestDecorator extends WearArmorDecorator {

    WearChestDecorator(IRobeAble iRobeAble) {
        this.iRobeAble = iRobeAble;
    }

    @Override
    public int getProtectionLevel() {
        return iRobeAble.getProtectionLevel() + 200;
    }

    @Override
    public String getClothes() {
        return iRobeAble.getClothes() + ", Chest";
    }
}
