package org.lessons.java.shop;

public class Televisione extends Prodotto{

    private boolean isSMart;
    private int inches;

    public Televisione(String name, String brand, int price, int iva, boolean isSmart, int inches){
        super(name, brand, price, iva);
        this.isSMart = isSmart;
        this.inches = inches;
    }

    public boolean getIsSmart(){
        return this.isSMart;
    }

    public int getInches(){
        return this.inches;
    }

    public void setIsSmart(boolean isSmart){
        this.isSMart = isSmart;
    }

    public void setInches(int inches){
        this.inches = inches;
    }
    
}
