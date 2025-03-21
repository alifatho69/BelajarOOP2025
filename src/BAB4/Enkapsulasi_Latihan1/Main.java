package BAB4.Enkapsulasi_Latihan1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fauzan
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Manager dengan nama, ID, gaji dasar, dan departemen
        Manager mgr = new Manager("Ahmad Santoso", "ID-MGR-001", 25000000, "Teknologi Informasi");
        
        // Menampilkan informasi
        mgr.tampilkanInfo();
    }
}
