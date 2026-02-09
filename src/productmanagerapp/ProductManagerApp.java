/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productmanagerapp;

/**
 *
 * @author trang
 */
public class ProductManagerApp {

public static void main(String[] args) {
        System.out.println("Hello Product Manager");
    }

public double calculateDiscount(double price, double percentOff) {
        return price - (price * percentOff / 100.0);
    }
    
}
