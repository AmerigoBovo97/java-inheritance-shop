package org.lessons.java.shop;

public class App {
        public static void main(String[] args) {
        
        Televisione product_1 = new Televisione("superTV", "samsung", 800, 22, new Display(55, 1440, "widescreen"));
        Televisione product_2 = new SmartTV("gigaTV", "sony", 1200, 22, new Display(45, 1080, "widescreen"), new Cpu("XR Processor", 2));
        Smartphone product_3 = new Smartphone("galaxy s25", "samsung", 1500, 22, 1565465198, 1024, new Display(7, 1440, "widescreen"), new Cpu("snapdragon", 8));
        Smartphone product_4 = new Smartphone("16 pro max", "apple", 5000, 22, 949854654, 256, new Display(5, 1080, "widescreen"), new Cpu("appleSilicon", 4));
        Cuffie product_5 = new Cuffie("airBuds", "asus", 90, 22, true, "verde");
        Cuffie product_6 = new Cuffie("epicSound", "sony", 125, 22, true, "nero");

        /* 

        Scanner input = new Scanner() */
    System.out.println(product_3.getName());
    }

}
