/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4.Enkapsulasi_Implementasi1;

/**
 *
 * @author Fauzan
 */
public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.tinggi = 8;
        segitiga.setAlas(5);
        System.out.println("Luas Segitiga = "+ Double.toString(segitiga.Luas()));
    }
}
