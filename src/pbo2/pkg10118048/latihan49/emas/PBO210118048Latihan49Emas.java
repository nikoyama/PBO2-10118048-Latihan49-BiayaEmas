/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan49.emas;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung biaya emas
 */
public class PBO210118048Latihan49Emas {

    public static void main(String[] args) {
        
        Emas emas  = new Emas(15.7);
        System.out.println("Emas yang Dibeli = " + emas.getBerat() + " gram");
        System.out.printf("Total Bayar = Rp.%,12.1f %n" , emas.hitungHarga(emas.getBerat()));
        System.out.println("\n*Harga 1 gram per Bulan Oktober = Rp. 570.000");
    }

}
