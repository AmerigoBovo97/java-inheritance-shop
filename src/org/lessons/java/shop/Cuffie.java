package org.lessons.java.shop;

public class Cuffie extends Prodotto{
    
    private boolean wireless;
    private String color;

    public Cuffie(String name, String brand, int price, int iva, boolean wireless, String color){
        super(name, brand, price, iva);
        this.wireless = wireless;
        this.color = color;
    }

    public boolean getBollean(){
        return this.wireless;
    }

    public String getColor(){
        return this.color;
    }

    public void setWireless(boolean wireless){
        this.wireless = wireless;
    }

    public void setColor(String color){
        this.color = color;
    }
}
