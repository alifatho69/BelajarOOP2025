/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author ASUS
 */
public class Prisma_Segitiga extends Segitiga{
    double t, vol;
    @Override
    double Volume() {
        vol = (Luas()*t);
        return vol;
    }

}
