/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6_ProjectPraktikum;

/**
 *
 * @author ASUS
 */
public class Limas_Segitiga extends Segitiga{
    double vol,t;  
    @Override
    double Volume() {
        vol = (Luas()*t)/3;
        return vol;
    }
}

