/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanKonstruktor;

/**
 *
 * @author Fauzan
 */
public class TrukMinyak {
    int jumlah_roda, kapasitas, bensin;
    String warna, jenis_minyak;
    
    // Konstruktor
    public TrukMinyak() {
        this.jumlah_roda = 6;
        this.kapasitas = 300;
        this.warna = "merah";
        this.jenis_minyak = "Pertamax Oplosan";
        System.out.println("Ini adalah konstruktor");
    }
}
