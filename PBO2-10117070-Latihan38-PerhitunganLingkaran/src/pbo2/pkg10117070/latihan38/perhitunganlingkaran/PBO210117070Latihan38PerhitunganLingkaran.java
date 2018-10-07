/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama : Aditya Nur Iskandar 
 * Kelas : PBO2/IF 2 
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program Menghitung Lingkaran
 */
public class PBO210117070Latihan38PerhitunganLingkaran {

    public static void main(String[] args) {
        String diameter;
        double d; //operand
        Scanner scn = new Scanner(System.in);
        Lingkaran clc = new Lingkaran();
        
        System.out.println("===Perhitungan Lingkaran===");
        
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            diameter = scn.nextLine();
            System.out.println((!diameter.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!diameter.matches("[0-9]*"));
        
        System.out.println("===Hasil Perhitungan Lingkaran===");
        d = Double.parseDouble(diameter); 
        
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                clc.jari2Lingkaran(d));
        System.out.printf("Luas Lingkaran = %.2f cm %n",
                clc.luasLingkaran(clc.jari2Lingkaran(d)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",
                clc.kelilingLingkaran(clc.jari2Lingkaran(d)));
    }
    
}
