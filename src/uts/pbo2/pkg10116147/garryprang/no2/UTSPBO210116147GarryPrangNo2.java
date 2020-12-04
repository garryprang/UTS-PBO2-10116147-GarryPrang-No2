/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pbo2.pkg10116147.garryprang.no2;

import java.util.Scanner;

/**
 *
 * @author
 * Nama      : Garry Prang
 * NIM       : 10116147
 * Kelas     : PBO-2
 * Deskripsi : Program penarikan uang (UTS No. 1).
 */
public class UTSPBO210116147GarryPrangNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo, jumlah;
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== PROGRAM PENARIKAN UANG ==========\n");
        System.out.print("Masukkan saldo awal\t\t: ");
        saldo = scanner.nextInt();
        System.out.print("Jumlah uang yang ingin diambil\t: ");
        jumlah = scanner.nextInt();
        Tabungan tabung = new Tabungan(saldo);
        System.out.println("Saldo anda sekarang\t\t: "+tabung.ambilUang(jumlah));
    }
    
}
