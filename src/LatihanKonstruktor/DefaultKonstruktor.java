/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanKonstruktor;

/**
 *
 * @author Fauzan
 */
// Class Kendaraan
class Kendaraan {
    // Atribut
    String nama, warna, pabrikan;
    int speed;
}

// Class Main
public class DefaultKonstruktor {
    public static void main(String[] args) {
        // Membuat objek
        Kendaraan mobil = new Kendaraan();
        // Kendaraan mobil = new Kendaraan(null, "", "Automobili-Lamborghini", 356);
        System.out.println("Nama Kendaraan : " + mobil.nama);
        System.out.println("Warna Kendaraan : " + mobil.warna);
        System.out.println("Pabrikan Kendaraan: " + mobil.pabrikan);
        System.out.println("Kecepatan maksimal: " + mobil.speed + "km/jam \n");
    }
}
