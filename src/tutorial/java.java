/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial;

// Membuat Class sebagai Template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}


public class java {
    public static void main(String[] args) {
        
        // Instansiasi / membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        mahasiswa1.nama = "Ucup";
        mahasiswa1.NIM = "23454567";
        mahasiswa1.jurusan = "Teknik Ternak Lele";
        mahasiswa1.IPK = 4;
        mahasiswa1.umur = 17;
        
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
        
        // Instansiasi / membuat objek
        Mahasiswa mahasiswa2 = new Mahasiswa();
        
        mahasiswa2.nama = "Asep";
        mahasiswa2.NIM = "2340567";
        mahasiswa2.jurusan = "Teknik Ternak Lele";
        mahasiswa2.IPK = 4;
        mahasiswa2.umur = 32;
        
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}
