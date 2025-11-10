package model;

public class SmartPhone extends Product {
    private boolean has5G;

    public SmartPhone() {
    }

    public SmartPhone(boolean has5G) {
        this.has5G = has5G;
    }

    public SmartPhone(String name, String description, double price, boolean has5G) {
        super(name, description, price);
        this.has5G = has5G;
    }

    @Override
    public String getInFo() {
        return super.getInFo()+", HAS5G:"+this.has5G;
    }
}
