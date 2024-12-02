package org.lessons.java.shop;

public class Carrello {
    
    private Prodotto[] cart;

    public static void main(String[] args) {
        
        Televisione product_1 = new Televisione("superTV", "samsung", 800, 22, true, 55);
        Televisione product_2 = new Televisione("gigaTV", "sony", 1200, 22, false, 65);
        Smartphone product_3 = new Smartphone("galaxy s25", "samsung", 1500, 22, 1565465198, 1024);
        Smartphone product_4 = new Smartphone("16 pro max", "apple", 5000, 22, 949854654, 16);
        Cuffie product_5 = new Cuffie("airBuds", "asus", 90, 22, true, "verde");
        Cuffie product_6 = new Cuffie("epicSound", "sony", 125, 22, true, "nero");

    }

    public Carrello(){
        this.cart = new Prodotto[0];
    }

    public Prodotto[] getCart(){
        return this.cart;
    } 

    public void addProduct(Prodotto newProduct){

        int cartLength = this.cart.length;
        Prodotto[] newCart = new Prodotto[cartLength + 1];

        for(int i = 0; i < cartLength; i++){
            newCart[i] = this.cart[i];
        }
        newCart[cartLength] = newProduct;
        
        this.cart = newCart;
    }
}
