/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author Fauzan
 */
public class Kendaraan_main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota");
        Sepeda sepeda1 = new Sepeda("Polygon");

        mobil1.bergerak();
        sepeda1.bergerak();
    }
}

