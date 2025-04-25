/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5.Overdding;

/**
 *
 * @author Fauzan
 */
// Kelas Anak (Subclass) yang melakukan overriding
class Anjing extends Hewan {
    @Override  // Annotation untuk menunjukkan bahwa ini adalah method overriding
    public void suara() {
        System.out.println("Anjing menggonggong: Guk! Guk!");
    }
}
