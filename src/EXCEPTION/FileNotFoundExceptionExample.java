/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXCEPTION;

/**
 *
 * @author Fauzan
 */
import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        // Penerapan FileNotFoundException → File yang dicari tidak ditemukan
        try {
            // Membaca File bernama "fauzan.txt", ada apa enggak?
            FileInputStream file = new FileInputStream("tidak_ada.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan!"); // Ngasih tau kalo error karena file nggak ada
        }
    }
}

