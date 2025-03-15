/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Inheritance_Latihan1;

/**
 *
 * @author Fauzan
 */
// Kelas Kucing mewarisi (extends) kelas Hewan
public class Kucing extends Hewan {
    // Konstruktor class Kucing
    public Kucing() {
        super(); // memanggil konstruktor parent Class
        System.out.println("Konstruktor Class Kucing");
    }
}
