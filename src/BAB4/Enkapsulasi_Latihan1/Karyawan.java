/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4.Enkapsulasi_Latihan1;

/**
 *
 * @author Fauzan
 */
public class Karyawan {
     // Atribut privat
    private String nama;
    private String id;
    private double gajiDasar;
    
    // Konstruktor untuk mengatur nama dan ID saat objek dibuat
    public Karyawan(String nama, String id, double gajiDasar) {
        this.nama = nama;
        this.id = id;
        this.gajiDasar = gajiDasar;
    }

    // Method privat untuk menghitung gaji akhir
    private double hitungGajiAkhir() {
        double tunjangan = gajiDasar * 0.2; // Tunjangan 20% dari gaji dasar
        return gajiDasar + tunjangan;
    }

    // Method protected agar subclass bisa mendapatkan gaji akhir
    protected double getGajiAkhir() {
        return hitungGajiAkhir();
    }

    // Method protected agar subclass bisa mendapatkan informasi dasar
    protected String getInfoDasar() {
        return "ID: " + id + "\nNama: " + nama;
    }
}
