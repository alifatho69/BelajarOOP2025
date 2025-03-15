/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Inheritance_Latihan1;

/**
 *
 * @author Fauzan
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan dari class Hewan
        Hewan hewan = new Hewan(); 
        System.out.println("Apakah hewan adalah Objek -> " + (hewan instanceof Object)); // true, karena semua class di Java adalah turunan Object
        System.out.println("Apakah hewan adalah Hewan -> " + (hewan instanceof Hewan)); // true, karena hewan dibuat dari class Hewan
        System.out.println("Apakah hewan adalah Kucing -> " + (hewan instanceof Kucing)); // false, karena hewan bukan turunan dari Kucing

        System.out.println("------------------------");

        // Membuat objek kucing dari class Kucing
        Kucing kucing = new Kucing(); 
        System.out.println("Apakah kucing adalah Objek -> " + (kucing instanceof Object)); // true, karena Kucing adalah turunan dari Object
        System.out.println("Apakah kucing adalah Hewan -> " + (kucing instanceof Hewan)); // true, karena Kucing mewarisi Hewan
        System.out.println("Apakah kucing adalah Kucing -> " + (kucing instanceof Kucing)); // true, karena kucing dibuat dari class Kucing
    }
}