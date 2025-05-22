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

public class IOExceptionExample {
    public static void main(String[] args) {
        
        // Penerapan IOException → Terjadi saat ada masalah dalam input/output.
        try {
            // Membaca File bernama "e.txt", ada apa enggak?
            FileReader file = new FileReader("e.txt");
        } catch (IOException e) {
            System.out.println("Terjadi IOException: " + e.getMessage()); // Ngasih tau kalo error karena file nggak ada
        }
    }
}

