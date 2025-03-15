/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Inheritance_Latihan2;

/**
 *
 * @author Fauzan
 */
public class main {
    public static void main(String[] args) {
      Lingkaran lkr = new Lingkaran(); // memanggil constructor
      
      lkr.Deskripsi();
      System.out.println("Hasilnya adalah :"+lkr.luas());
      
      Tabung tbg = new Tabung();
      tbg.Keterangan();
     
      System.out.println(" volumenya adalah :" +tbg.volume());
      
       } 
}
