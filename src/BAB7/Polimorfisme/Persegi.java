/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Polimorfisme;

/**
 *
 * @author ConlyAriella
 */
public class Persegi extends BangunDatar{
    public double sisi;
    public Persegi(double sisi) {
        this.sisi = sisi;
    } 
    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
    @Override
    double hitungKeliling() {
        return 4 * sisi;
    } }

