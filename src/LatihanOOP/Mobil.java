/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanOOP;

/**
 *
 * @author Fauzan
 */
class Mobil extends Kendaraan {

    Mobil(String merk) {
        super(merk);
    }

    void bergerak() {
        System.out.println("Mobil " + merk + " bergerak dengan roda dan mesin.");
    }
}

class Sepeda extends Kendaraan {

    Sepeda(String merk) {
        super(merk);
    }

    void bergerak() {
        System.out.println("Sepeda " + merk + " bergerak dengan digas oleh manusia.");
    }
}
