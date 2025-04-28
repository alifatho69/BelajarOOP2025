/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanOOP;

/**
 *
 * @author Fauzan
 */
abstract class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Mitsubishi");
        Sepeda sepeda = new Sepeda("Shogun RWB");
        
        mobil.bergerak();
        sepeda.bergerak();
            
    }
}