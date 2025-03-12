/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB2.Constructor;

/**
 *
 * @author Fauzan
 */
// Class gak pake konstruktor
class Polos {
    String dataString;
    int dataInteger;
}
// Class pake konstruktor

class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    
    Mahasiswa() {
        System.out.println("Ini adalah Konstruktor");
    }
}



public class LatihanKonstruktor {
    public static void main(String[] args) {
//        Polos objectPolos = new Polos();
//        objectPolos.dataString = "Polos";
//        objectPolos.dataInteger = 0;
//        
//        System.out.println(objectPolos.dataString);
//        System.out.println(objectPolos.dataInteger);

//        Mahasiswa mahasiswa1 = new Mahasiswa();
          new Mahasiswa();
    }
}
