/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author AVITA
 */
public class Lingkaran {
    void luasLingkaran(int r){
        int luas;
        luas = r * r * 22 / 7;
        System.out.println("Luas lingkarannya adalah : " + luas + " satuan luas");
    }
    
    void luasLingkaran(double r){
        double luas;
        luas = r * r * 22 / 7;
        System.out.println("Luas lingkarannya adalah : " + luas + " satuan luas");
    }
    
    void kelilingLingkaran(int r){
        int keliling;
        keliling = 2 * r * 22 / 7;
        System.out.println("Keliling lingkarannya adalah : " + keliling + " satuan panjang");
    }
    
    void kelilingLingkaran(double r){
        double keliling;
        keliling = 2 * r * 22 / 7;
        System.out.println("Keliling lingkarannya adalah : " + keliling + " satuan panjang");
    }
}
