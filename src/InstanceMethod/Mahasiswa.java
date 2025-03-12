/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstanceMethod;

/**
 *
 * @author Fauzan
 */
public class Mahasiswa {
    String nama;
    int umur;
    // Metode instance untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
    // Metode instance untuk mengubah umur mahasiswa
    public void ubahUmur(int newUmur) {
        umur = newUmur;
    }
}
