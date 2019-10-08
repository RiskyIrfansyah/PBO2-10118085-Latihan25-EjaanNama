/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author Risky Irfansyah
 * Nama     : Risky Irfansyah
 * Kelas    : PBO2
 * Nim      : 10118085
 *  * Deskripsi Program : Ejaan Nama
 */
public class PBO210118085Latihan25EjaanNama {
    public static String nama;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan nama depan anda untuk di eja : ");
        nama = scanner.next();
        System.out.println("Ejaan untuk " + nama + " adalah : ");
        for (int i=0; i<nama.length(); i++){
            System.out.println("Huruf ke-" + (i+1) + " : " + nama.substring(i,i+1));
        }
    }
}
