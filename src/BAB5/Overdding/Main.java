/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5.Overdding;

/**
 *
 * @author Fauzan
 */
// Kelas Utama (Main Program)
public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();  // Objek dari superclass
        hewan1.suara(); // Output: Hewan mengeluarkan suara...

        Anjing dog = new Anjing();   // Objek dari subclass
        dog.suara(); // Output: Anjing menggonggong: Guk! Guk!

    }
}
