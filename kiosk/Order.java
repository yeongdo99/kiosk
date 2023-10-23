package kiosk;

import java.util.ArrayList;

public class Order {

    private static ArrayList<Product> cart = new ArrayList<>(); // default list
    private static ArrayList<Product> cntCart = new ArrayList<>(); // count list
    private static ArrayList<Product> totalCart = new ArrayList<>(); // total list

    public static double salePriceTotal() {
        double salePrice = 0.0;
        for (int i = 0; i < cart.size(); i++) {
            salePrice += cart.get(i).getPrice();
        }
        return salePrice;
    }




    public static ArrayList<Product> getCart() {
        return cart;
    }
    public static ArrayList<Product> getCntCart() {
        return cntCart;
    }
    public static  ArrayList<Product> getTotalCart() {
        return totalCart;
    }
}
