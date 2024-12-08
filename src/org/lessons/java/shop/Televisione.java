package org.lessons.java.shop;

public class Televisione extends Prodotto{

    private boolean isSmart;
    private int inches;

    public Televisione(String name, String brand, int price, int iva, boolean isSmart, int inches){
        super(name, brand, price, iva);
        this.isSmart = isSmart;
        this.inches = inches;
    }

    public boolean getIsSmart(){
        return this.isSmart;
    }

    public int getInches(){
        return this.inches;
    }

    public void setIsSmart(boolean isSmart){
        this.isSmart = isSmart;
    }

    public void setInches(int inches){
        this.inches = inches;
    }
    
}
