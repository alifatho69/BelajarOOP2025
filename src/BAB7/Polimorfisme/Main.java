/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Polimorfisme;

/**
 *
 * @author ConlyAriella
 */
public class Main {
    public static void main(String[] args) {
        BangunDatar Bdatar; // deklarasi referensi superclass

        System.out.println("Penerapan Polimorfisme Upcasting");

        Bdatar = new Persegi(10); // Upcasting
        System.out.println("Luas Persegi              : " + Bdatar.hitungLuas());
        System.out.println("Keliling Persegi          : " + Bdatar.hitungKeliling());
        System.out.println("---------------------------------------------");

        Bdatar = new Lingkaran(20); // Upcasting lagi
        System.out.println("Luas Lingkaran            : " + Bdatar.hitungLuas());
        System.out.println("Keliling Lingkaran        : " + Bdatar.hitungKeliling());
        System.out.println("---------------------------------------------");

        System.out.println("Penerapan Polimorfisme Downcasting");

        // Buat objek Persegi terlebih dahulu untuk bisa didowncast
        Bdatar = new Persegi(8);

        // Lakukan pemeriksaan dengan instanceof sebelum downcasting
        if (Bdatar instanceof Persegi) {
            Persegi kotak = (Persegi) Bdatar; // Downcasting aman
            System.out.println("Luas Persegi              : " + kotak.hitungLuas());
            System.out.println("Keliling Persegi          : " + kotak.hitungKeliling());
        } else {
            System.out.println("Bdatar bukan objek Persegi, tidak bisa di-cast.");
        }

        System.out.println("---------------------------------------------");
    }
}


