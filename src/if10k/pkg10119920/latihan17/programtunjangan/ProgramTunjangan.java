/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119920.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 */

public class ProgramTunjangan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String stat, status;
        double gaji, tunjangan, total;
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gaji = input.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        stat = input.next();
        status = stat.toLowerCase();
        System.out.print("\n");
        if(status.equals("menikah"))
            {
            tunjangan = gaji * 0.35 ;
            total = gaji + tunjangan;
            System.out.println("========Hasil Perhitungan Gaji Anda=========");
            System.out.println("Gaji Pokok \t\t : Rp "+gaji);
            System.out.println("Tunjangan \t\t : Rp "+tunjangan);
            System.out.println("Total Gaji \t\t : Rp "+total);
            }
        else if(status.equals("belum"))
            {
            tunjangan = 0;
            total = gaji + tunjangan;
            System.out.println("========Hasil Perhitungan Gaji Anda=========");
            System.out.println("Gaji Pokok \t\t : Rp "+gaji);
            System.out.println("Tunjangan \t\t : Rp "+tunjangan);
            System.out.println("Total Gaji \t\t : Rp "+total);
            }
        else
            {System.out.println("Pilihan Salah!");}
        System.out.println("(Developed by : Umar Said Adi Pranoto)");
    }
}