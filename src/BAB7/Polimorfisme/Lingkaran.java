/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Polimorfisme;

/**
 *
 * @author ConlyAriella
 */
public class Lingkaran extends BangunDatar{
    public double jariJari;
    double phi = 3.14;

    public Lingkaran(int jariJari){
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungLuas() {
        return phi * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * phi * jariJari;
    }
    
}