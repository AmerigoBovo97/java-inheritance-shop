package org.lessons.java.shop;

public class Display {
    
    private int inches;
    private int resolution;
    private String aspectRatio; // possible ratios {"standard"(4:3), "widescreen"(16:9), "ultrawide"(21:9), "superUltrawide"(32:9)}

    public Display(int inches, int resolution, String aspectRation){
        this.inches = inches;
        this.resolution = resolution;
        this.aspectRatio = aspectRation;
    }

    public int getInches(){
        return this.inches;
    }

    public int getResolution(){
        return this.resolution;
    }

    public String getAspectRatio(){
        return this.aspectRatio;
    }
}
