/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstanceMethod;

/**
 *
 * @author Fauzan
 */
public class Main_mahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Firman";
        mhs1.umur = 23;
        mhs1.tampilkanInfo(); // Memanggil metode instance
        mhs1.ubahUmur(21);    // Memanggil metode instance untuk mengubah umur
        mhs1.tampilkanInfo(); // Memanggil metode instance lagi static void main(String[] args) {
    }
}

