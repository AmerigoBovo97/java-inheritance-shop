package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    
    private int productCode;
    private String name;
    private String brand;
    private int price;
    private int iva;


    public Prodotto(String name, String brand, int price, int iva){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
        Random generator = new Random();
        this.productCode = generator.nextInt(10000);
    }

    public int getProduct(){
        return this.productCode;
    }

    public String getName(){
        return this.name;
    }
    
    public String getBrand(){
        return this.brand;
    }

    public int getPrice(){
        return this.price;
    }

    public int getIva(){
        return this.iva;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setBrand(String newBrand){
        this.name = newBrand;
    }

    public void setPrice(String newPrice){
        this.name = newPrice;
    }

    public void setIva(String newIva){
        this.name = newIva;
    }

    public double getIvaPrice(){
        double finalPrice = Math.round((this.price + (this.price * this.iva / 100)) * 100.0) / 100.0;
        return finalPrice;
    }
}
