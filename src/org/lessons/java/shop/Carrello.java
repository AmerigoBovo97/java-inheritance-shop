package org.lessons.java.shop;

public class Carrello {
    
    private Prodotto[] cart;


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
