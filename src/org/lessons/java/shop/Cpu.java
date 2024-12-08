package org.lessons.java.shop;

public class Cpu {
    
    private String brand;
    private int cores;

    public Cpu(String brand, int cores){
        this.brand = brand;
        this.cores = cores;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getcores(){
        return this.cores;
    }
}
