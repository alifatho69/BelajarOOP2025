/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticMethod;

/**
 *
 * @author Fauzan
 */
public class staticDemo {
    static int x;
    static int y;
    static int hasil;
    
    static int jumlah(){
        hasil = x * y ;
        return hasil;
    }
    public static void main(String[] args) {
      staticDemo.x = 4;
      staticDemo.y = 5;
      System.out.println("Hasil Penjualan : "+staticDemo.jumlah());
    }

}
