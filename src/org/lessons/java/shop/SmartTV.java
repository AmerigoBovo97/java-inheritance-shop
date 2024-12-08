package org.lessons.java.shop;

public class SmartTV extends Televisione{
    
    private Cpu cpu;

    public SmartTV(String name, String brand, int price, int iva, Display display, Cpu cpu){
        super(name, brand, price, iva, display);
        this.cpu = cpu;
    }

    public Cpu getCpu(){
        return this.cpu;
    }
}
