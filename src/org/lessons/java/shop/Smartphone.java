package org.lessons.java.shop;

public class Smartphone extends Prodotto{

    private int imei;
    private int storage;

    public Smartphone(String name, String brand, int price, int iva, int imei, int storage){
        super(name, brand, price, iva);
        this.imei = imei;
        this.storage = storage;
    }

    public int getImei(){
        return this.imei;
    }

    public int getStorage(){
        return this.storage;
    }

    public void setImei(int imei){
        this.imei = imei;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }
}