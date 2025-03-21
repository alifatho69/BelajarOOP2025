/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4.Enkapsulasi_Latihan1;

/**
 *
 * @author Fauzan
 */
public class Manager extends Karyawan {
    private String departemen;
    
    // Konstruktor Manager, memanggil konstruktor superclass
    public Manager(String nama, String id, double gajiDasar, String departemen) {
        super(nama, id, gajiDasar);
        this.departemen = departemen;
    }
    
    // Menampilkan informasi Manager, termasuk gaji akhir
    public void tampilkanInfo() {
        System.out.println(getInfoDasar() + 
                         "\nGaji Akhir: Rp" + String.format("%,.2f", getGajiAkhir()) + 
                         "\nDepartemen: " + departemen);
    }
}
