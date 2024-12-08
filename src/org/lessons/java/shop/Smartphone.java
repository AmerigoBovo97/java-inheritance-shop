package org.lessons.java.shop;

public class Smartphone extends Prodotto{

    private int imei;
    private int storage;
    private Display display;
    private Cpu cpu;

    public Smartphone(String name, String brand, int price, int iva, int imei, int storage, Display display, Cpu cpu){
        super(name, brand, price, iva);
        this.imei = imei;
        this.storage = storage;
        this.display = display;
        this.cpu = cpu;
    }

    public int getImei(){
        return this.imei;
    }

    public int getStorage(){
        return this.storage;
    }

    public Display getDisplay(){
        return this.display;
    }

    public Cpu getCpu(){
        return this.cpu;
    }
}