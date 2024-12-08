package org.lessons.java.shop;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
        
        Televisione product_1 = new Televisione("superTV", "samsung", 800, 22, true, 55);
        Televisione product_2 = new Televisione("gigaTV", "sony", 1200, 22, false, 65);
        Smartphone product_3 = new Smartphone("galaxy s25", "samsung", 1500, 22, 1565465198, 1024);
        Smartphone product_4 = new Smartphone("16 pro max", "apple", 5000, 22, 949854654, 16);
        Cuffie product_5 = new Cuffie("airBuds", "asus", 90, 22, true, "verde");
        Cuffie product_6 = new Cuffie("epicSound", "sony", 125, 22, true, "nero");

        /* 

        Scanner input = new Scanner() */
    System.out.println(product_3.getName());
    }

}
