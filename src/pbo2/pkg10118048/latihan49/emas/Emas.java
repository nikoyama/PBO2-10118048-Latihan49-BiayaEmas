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
public class Emas {
    
    private double berat;

    public Emas(double berat) {
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }
    
    public double hitungHarga(double berat) {
        return 570_000 * berat;
    }
    
}
