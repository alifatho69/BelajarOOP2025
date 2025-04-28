/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author Fauzan
 */
abstract class Kendaraan {
    String merk;

    Kendaraan(String merk) {
        this.merk = merk;
    }

    // Method abstract
    abstract void bergerak();
}

