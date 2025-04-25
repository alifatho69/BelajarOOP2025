/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5.Overloading;

/**
 *
 * @author Fauzan
 */
public class Main {
    public static void main(String[] args) {
        BangunDatar BD = new BangunDatar();
        System.out.println("Luas Bangun Datar\n");
        System.out.println("Luas aja : " + BD.Luas());
        System.out.println("Luas Lingkaran : " + BD.Luas(5, 10));
        System.out.println("Luas Lingkaran : " + BD.Luas(12.5));
        System.out.println("Luas Persegi : " + BD.Luas(5));
    }
}
