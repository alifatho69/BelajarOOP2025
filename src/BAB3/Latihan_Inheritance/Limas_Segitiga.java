/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Latihan_Inheritance;

/**
 *
 * @author Fauzan
 */
public class Limas_Segitiga extends Segitiga {
    double t,vol;  
    double volumeLimas(){
        vol = (Luas()*t)/3;
        return vol;
    } 
}

