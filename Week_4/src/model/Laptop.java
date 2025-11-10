package model;

public class Laptop extends Product {
    private String ram;
    private String cpu;

    public Laptop() {
    }

    public Laptop(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    public Laptop(String name, String description, double price, String ram, String cpu) {
        super(name, description, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String getInFo() {
        return super.getInFo()+", RAM:"+this.ram  + ", CPU:" +this.cpu;
    }
}
