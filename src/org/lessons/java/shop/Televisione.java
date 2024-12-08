package org.lessons.java.shop;

public class Televisione extends Prodotto{

    private Display display;

    public Televisione(String name, String brand, int price, int iva, Display display){
        super(name, brand, price, iva);
        this.display = display;
    }

    public Display getDisplay(){
        return this.display;
    }
    
}
